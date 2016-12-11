package iu.edu.teambash.aurora;

import iu.edu.teambash.aurora.bean.*;
import iu.edu.teambash.aurora.client.AuroraThriftClient;
import iu.edu.teambash.aurora.client.sdk.ScheduledTask;
import iu.edu.teambash.aurora.utils.AuroraThriftClientUtil;
import iu.edu.teambash.aurora.utils.Constants;
import org.apache.log4j.Logger;

import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AuroraClient {

    final static Logger logger = Logger.getLogger(AuroraClient.class);

    public static JobDetailsResponseBean getJobDetails(String jobName) throws Exception {
        JobKeyBean jobKey = new JobKeyBean("devel", "team-bash", jobName);
        return (JobDetailsResponseBean) AuroraThriftClient.getAuroraThriftClient(Constants.AURORA_SCHEDULER_PROP_FILE).getJobDetails(jobKey);
    }

    public static ResponseBean createJob(String jobName) throws Exception {

        JobKeyBean jobKey = new JobKeyBean("devel", "team-bash", jobName);
        IdentityBean owner = new IdentityBean("team-bash");
        ProcessBean proc1 = new ProcessBean("process_1", "docker run -i --volumes-from wpsgeog --volumes-from wrfinputsandy -v ~/wrfoutput:/wrfoutput --name " + jobName + "_pc1 bigwxwrf/ncar-wrf /wrf/run-wrf", false);
        ProcessBean proc2 = new ProcessBean("process_2", "docker run -i --rm=true -v ~/wrfoutput:/wrfoutput --name " + jobName + "_pc2 bigwxwrf/ncar-ncl", false);
        ProcessBean proc0 = new ProcessBean("process_0", "docker rm -f " + jobName + "_pc1; docker rm -f " + jobName + "_pc2;echo 'remove containers'", false);
        Set<ProcessBean> processes = new LinkedHashSet<>();
        processes.add(proc1);
        processes.add(proc2);
        processes.add(proc0);

        ResourceBean resources = new ResourceBean(0.2, 200, 200);

        TaskConfigBean taskConfig = new TaskConfigBean("run_forecast_task", processes, resources);
        JobConfigBean jobConfig = new JobConfigBean(jobKey, owner, taskConfig, "example");

        String executorConfigJson = AuroraThriftClientUtil.getExecutorConfigJson(jobConfig);
        logger.info(executorConfigJson);

        AuroraThriftClient client = AuroraThriftClient.getAuroraThriftClient(Constants.AURORA_SCHEDULER_PROP_FILE);
        return client.createJob(jobConfig);

    }

    public static List<JobResultsBean> getJobDetailsList(List<String> jobNames) throws Exception {
        List<JobResultsBean> jobResultsBeanList = new ArrayList<>();
        for (String jobName : jobNames) {
            JobDetailsResponseBean jobDetailsResponseBean = getJobDetails(jobName);
            ScheduledTask scheduledTask = jobDetailsResponseBean.getTasks().get(0);
            List<URI> urlList = new ArrayList<>();
            urlList.add(new URI(scheduledTask.getAssignedTask().getSlaveHost() + scheduledTask.getAssignedTask().getTaskId()));
            JobResultsBean jobResultsBean = new JobResultsBean(jobName, scheduledTask.getStatus(), urlList);
            jobResultsBeanList.add(jobResultsBean);
        }
        return jobResultsBeanList;
    }
}
