package top.zerg.ribbon.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zerg.ribbon.bean.Animal;

import java.util.Date;

@RestController
@RequestMapping("/FastJson")
public class FastJsonController {

    @GetMapping("/beanToJson")
    public String beanToJson() {
        Animal animal = new Animal();
        animal.setSpeed("12312");
        animal.setBoth(new Date());
        animal.setWidth("23123");
        String str = JSON.toJSONString(animal);

        return str;
    }

}
