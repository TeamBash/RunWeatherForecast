package iu.edu.teambash;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import iu.edu.teambash.resources.ForecastResource;

import javax.servlet.ServletException;

public class runWeatherForecastApplication extends Application<runWeatherForecastConfiguration> {

    public static void main(final String[] args) throws Exception {
        new runWeatherForecastApplication().run(args);
    }

    @Override
    public String getName() {
        return "runWeatherForecast";
    }

    @Override
    public void initialize(final Bootstrap<runWeatherForecastConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final runWeatherForecastConfiguration configuration,
                    final Environment environment) throws ServletException {
        // TODO: implement application
        configuration.init();
        final ForecastResource forecastResource = new ForecastResource();
        environment.jersey().register(forecastResource);
    }

}
