package iu.edu.teambash.resources;

import iu.edu.teambash.aurora.AuroraClient;
import iu.edu.teambash.aurora.bean.ResponseBean;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Raghuveer Raavi on 12/10/2016.
 */
@Path("/runWeatherForecast")
public class ForecastResource {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseBean generateForecast(String jobName) {
        ResponseBean response = null;
        try {
            response = AuroraClient.createJob(jobName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
