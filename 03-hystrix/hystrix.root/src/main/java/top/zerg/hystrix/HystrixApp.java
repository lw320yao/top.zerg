package top.zerg.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HystrixApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(HystrixApp.class);
    }
}
