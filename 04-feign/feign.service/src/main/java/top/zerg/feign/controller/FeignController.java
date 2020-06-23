package top.zerg.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zerg.feign.service.FeignService;

@RestController
public class FeignController {

    @Autowired
    private FeignService service;

    @Value("${foo}")
    private String foo;

    @GetMapping("/getPort")
    public String getPort() {
        return service.getPort();
    }

    @GetMapping("/foo")
    public String foo(){
        return foo;
    }

}
