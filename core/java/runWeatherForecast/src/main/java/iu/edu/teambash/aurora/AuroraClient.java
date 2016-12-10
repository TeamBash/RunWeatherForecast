package iu.edu.teambash.aurora;

import iu.edu.teambash.aurora.bean.*;
import iu.edu.teambash.aurora.client.AuroraThriftClient;
import iu.edu.teambash.aurora.client.sdk.*;
import iu.edu.teambash.aurora.utils.AuroraThriftClientUtil;
import iu.edu.teambash.aurora.utils.Constants;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;

import java.util.LinkedHashSet;
import java.util.Set;

public class AuroraClient {

    final static Logger logger = Logger.getLogger(AuroraClient.class);
    /** The properties. */

    /**
     * Gets the job summary.
     *
     * @param client the client
     * @return the job summary
     */
    public void getJobSummary(ReadOnlyScheduler.Client client) {
        try {
            Response response = client.getJobs("centos");
            logger.info("Response status: " + response.getResponseCode().name());
            if (response.getResult().isSetGetJobsResult()) {
                GetJobsResult result = response.getResult().getGetJobsResult();
                logger.info(result);
                Set<JobConfiguration> jobConfigs = result.getConfigs();
                for (JobConfiguration jobConfig : jobConfigs) {
                    logger.info(jobConfig);
                    JobKey jobKey = jobConfig.getKey();
                    Identity owner = jobConfig.getOwner();
                    TaskConfig taskConfig = jobConfig.getTaskConfig();
                    ExecutorConfig exeConfig = taskConfig.getExecutorConfig();

                    logger.info("\n**** JOB CONFIG ****");
                    logger.info("\t # instanceCount: " + jobConfig.getInstanceCount());
                    logger.info("\t >> Job Key <<");
                    logger.info("\t\t # name: " + jobKey.getName());
                    logger.info("\t\t # role: " + jobKey.getRole());
                    logger.info("\t\t # environment: " + jobKey.getEnvironment());
                    logger.info("\t >> Identity <<");
                    logger.info("\t\t # owner: " + owner.getUser());
                    logger.info("\t >> Task Config <<");
                    logger.info("\t\t # numCPUs: " + taskConfig.getNumCpus());
                    logger.info("\t\t # diskMb: " + taskConfig.getDiskMb());
                    logger.info("\t\t # ramMb: " + taskConfig.getRamMb());
                    logger.info("\t\t # priority: " + taskConfig.getPriority());
                    logger.info("\t >> Executor Config <<");
                    logger.info("\t\t # name: " + exeConfig.getName());
                    logger.info("\t\t # data: " + exeConfig.getData());
                }

            }
        } catch (TException e) {
            logger.error("Error while executing getJobSummary", e);
        }
    }

    public void getJobDetails() throws Exception {
        JobKeyBean jobKey = new JobKeyBean("devel", "team-bash", "bash_wrf");

        JobDetailsResponseBean responseBean = (JobDetailsResponseBean) AuroraThriftClient.getAuroraThriftClient(Constants.AURORA_SCHEDULER_PROP_FILE).getJobDetails(jobKey);
        logger.info(responseBean.toString());
    }

    public void createJob() throws Exception {

        JobKeyBean jobKey = new JobKeyBean("devel", "team-bash", "bash_wrf");
        IdentityBean owner = new IdentityBean("team-bash");

        //ProcessBean proc0 = new ProcessBean("process_0", "docker rm -f ncarwrfsandy; docker rm -f postproc;", false);
        ProcessBean proc1 = new ProcessBean("process_1", "docker run -i --volumes-from wpsgeog --volumes-from wrfinputsandy -v ~/wrfoutput:/wrfoutput --name ncarwrfsandy bigwxwrf/ncar-wrf /wrf/run-wrf", false);
        ProcessBean proc2 = new ProcessBean("process_2", "docker run -i --rm=true -v ~/wrfoutput:/wrfoutput --name postproc bigwxwrf/ncar-ncl", false);
        Set<ProcessBean> processes = new LinkedHashSet<>();
        //processes.add(proc0);
        processes.add(proc1);
        processes.add(proc2);

        ResourceBean resources = new ResourceBean(0.2, 200, 200);

        TaskConfigBean taskConfig = new TaskConfigBean("run_forecast_task", processes, resources);
        JobConfigBean jobConfig = new JobConfigBean(jobKey, owner, taskConfig, "example");

        String executorConfigJson = AuroraThriftClientUtil.getExecutorConfigJson(jobConfig);
        logger.info(executorConfigJson);

        AuroraThriftClient client = AuroraThriftClient.getAuroraThriftClient(Constants.AURORA_SCHEDULER_PROP_FILE);
        ResponseBean response = client.createJob(jobConfig);
    }
}
