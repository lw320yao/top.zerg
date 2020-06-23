package top.zerg.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HystrixService {

    @Autowired
    private RestTemplate template;

    @HystrixCommand(fallbackMethod = "error")
    public String getPort(){
        ResponseEntity<String> forEntity = template.getForEntity("http://ribbon/ribbon/getPort", String.class);
        return forEntity.getBody();
    }

    public String error() {
        return "error back";
    }

}
