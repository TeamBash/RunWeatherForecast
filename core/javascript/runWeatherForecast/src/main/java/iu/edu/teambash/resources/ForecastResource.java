package iu.edu.teambash.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Raghuveer Raavi on 12/10/2016.
 */
@Path("/runWeatherForecast")
public class ForecastResource {
    @GET
    @Produces("application/xml")
    public String generateForecast(){
        String forecast =  "<kml><b1>HELLO</b1></kml>";
        return forecast;
    }
}
