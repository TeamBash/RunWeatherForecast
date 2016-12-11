package iu.edu.teambash;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import iu.edu.teambash.resources.ForecastResource;
import iu.edu.teambash.resources.JobDetailsResource;

import javax.servlet.ServletException;

public class RunWeatherForecastApplication extends Application<RunWeatherForecastConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RunWeatherForecastApplication().run(args);
    }

    @Override
    public String getName() {
        return "runWeatherForecast";
    }

    @Override
    public void initialize(final Bootstrap<RunWeatherForecastConfiguration> bootstrap) {
    }

    @Override
    public void run(final RunWeatherForecastConfiguration configuration,
                    final Environment environment) throws ServletException {
        configuration.init();
        environment.jersey().register(new ForecastResource());
        environment.jersey().register(new JobDetailsResource());
    }

}
