package top.zerg.consumer.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zerg.consumer.service.ConsumerService;

@RestController
@RequestMapping("/consumer")
@Api(value = "consumer api")
public class ConsumerController {

    @Autowired
    private ConsumerService service;

    @GetMapping("/getRibbonPort")
    public String getRibbonPort() {
        String port = service.getPort();
        return port;
    }

}
