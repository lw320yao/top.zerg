package top.zerg.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import top.zerg.ribbon.bean.Animal;
import top.zerg.ribbon.service.RibbonService;

import java.util.Date;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RibbonService service;

    @Value("${foo}")
    private String foo;

    @GetMapping("/getHello")
    public String getHello() {
        return "success";
    }

    @GetMapping("/getPort")
    public String getPort() {
        return service.getPort();
    }

    @GetMapping("/foo")
    public String foo() {
        return foo;
    }

    @PostMapping("/testPost/{param}")
    public String testPost(
            @PathVariable("param") String param
    ) {
        return "testpost success" + param;
    }

    @PostMapping("/testPost")
    public Animal testPost2(
            @RequestParam("param") String param
    ) {
        Animal animal = new Animal();
        animal.setBoth(new Date());
        animal.setHeight("1321");
        animal.setWidth("222");
        animal.setSex("male");
        animal.setSpeed("90");
        return animal;
    }
}
