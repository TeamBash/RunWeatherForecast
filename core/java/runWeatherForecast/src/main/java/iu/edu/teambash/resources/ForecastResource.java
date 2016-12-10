package iu.edu.teambash.resources;

import iu.edu.teambash.aurora.AuroraClient;
import iu.edu.teambash.mesos.MesosService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Raghuveer Raavi on 12/10/2016.
 */
@Path("/runWeatherForecast")
public class ForecastResource {
    @GET
    @Produces("application/xml")
    public String generateForecast(){
        MesosService mesosService = new MesosService();
        mesosService.execute();
        String forecast =  "<kml><b1>HELLO</b1></kml>";
        return forecast;
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws Exception {
        AuroraClient client = new AuroraClient();
        client.getJobDetails();
        return "hello";
    }
}
