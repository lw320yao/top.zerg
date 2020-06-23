package top.zerg.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    @Autowired
    private RestTemplate template;

    public String getPort() {
        ResponseEntity<String> forEntity = template.getForEntity("http://RIBBON/ribbon/getPort", String.class);
        return forEntity.getBody();
    }
}
