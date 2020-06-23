package top.zerg.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zerg.hystrix.service.HystrixService;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {

    @Autowired
    private HystrixService service;

    @GetMapping("/getPort")
    public String getPort() {
        return service.getPort();
    }

}
