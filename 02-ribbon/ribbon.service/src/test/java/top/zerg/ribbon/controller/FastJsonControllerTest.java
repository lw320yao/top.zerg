package top.zerg.ribbon.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import top.zerg.ribbon.bean.Animal;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FastJsonControllerTest {

    @Test
    void beanToJson() {

        Animal animal = new Animal();
        animal.setSpeed("12312");
        animal.setBoth(new Date());
        animal.setWidth("23123");
        animal.setHeight("231");
        String str = JSON.toJSONString(animal);
        System.out.println(str);
        Animal object = JSON.parseObject(str,Animal.class);
        System.out.println(object);
    }

    @Test
    void jsonObject() {
        JSONArray array = new JSONArray();
        for (int i=0;i<5;i++) {
            JSONObject object = new JSONObject();
            object.put("name","dali");
            object.put("age",13+i);
            array.add(object);
        }
        String string = array.toJSONString();
        System.out.println(string);
    }
}