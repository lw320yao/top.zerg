package top.zerg.sleuth;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SleuthApp {


    private static final Logger LOGGER = LoggerFactory.getLogger(SleuthApp.class);

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/test")
    public String callMiya() {
        LOGGER.info("callmiya");
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://sleuth/test", String.class);
        return forEntity.getBody();
    }

    @GetMapping("/info")
    public String test() {
        return "this is miya";
    }

    public static void main(String[] args) {
        SpringApplication.run(SleuthApp.class);
    }

}
