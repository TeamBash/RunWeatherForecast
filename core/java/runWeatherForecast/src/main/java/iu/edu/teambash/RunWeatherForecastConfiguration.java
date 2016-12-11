package iu.edu.teambash;

import io.dropwizard.Configuration;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder;
import org.apache.curator.x.discovery.ServiceInstance;
import org.apache.curator.x.discovery.UriSpec;

import javax.servlet.ServletException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RunWeatherForecastConfiguration extends Configuration {
    public void init() throws ServletException {
        String ip = null;
        try {
            java.net.URL getMyIP = new java.net.URL("http://checkip.amazonaws.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(getMyIP.openStream()));
            ip = in.readLine();
            //ip = "127.0.0.1";
            System.out.println("Host IP is: ---------------------> " + ip);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        String msName = "runWeatherForecast";
        String msName1 = "getJobDetails";
        String microServiceURL = "http://" + ip + ":8200/" + msName;
        String microServiceURL1 = "http://" + ip + ":8200/" + msName1;
        int port = 8200;

        CuratorFramework curatorFramework = CuratorFrameworkFactory.newClient(ip + ":2181", new RetryNTimes(5, 1000));
        curatorFramework.start();

        try {
            ServiceInstance serviceInstance = ServiceInstance.builder().uriSpec(new UriSpec(microServiceURL)).address(ip).port(port).name(msName).build();
            ServiceDiscoveryBuilder.builder(Void.class).basePath("services").client(curatorFramework).thisInstance(serviceInstance).build().start();
            ServiceInstance serviceInstance1 = ServiceInstance.builder().uriSpec(new UriSpec(microServiceURL1)).address(ip).port(port).name(msName1).build();
            ServiceDiscoveryBuilder.builder(Void.class).basePath("services").client(curatorFramework).thisInstance(serviceInstance1).build().start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
