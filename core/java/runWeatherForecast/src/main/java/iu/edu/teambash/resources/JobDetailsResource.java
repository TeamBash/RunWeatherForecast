package iu.edu.teambash.resources;

import iu.edu.teambash.aurora.AuroraClient;
import iu.edu.teambash.aurora.bean.JobResultsBean;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by janakbhalla on 10/12/16.
 */

@Path("/getJobDetails")
public class JobDetailsResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<JobResultsBean> getJobDetails(List<String> jobNames) {
        try {
            return AuroraClient.getJobDetailsList(jobNames);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
