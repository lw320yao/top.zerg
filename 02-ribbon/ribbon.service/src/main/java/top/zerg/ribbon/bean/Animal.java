package top.zerg.ribbon.bean;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Animal {

    @JSONField(ordinal = 2,serialize = false)
    private String height;

    @JSONField(ordinal = 3)
    private String width;

    @JSONField(ordinal = 4)
    private String name;

    @JSONField(ordinal = 5)
    private String speed;

    @JSONField(ordinal = 6)
    private String sex;

    @JSONField(name = "name for both" ,format = "yyyy-MM-dd",ordinal = 1)
    private Date both;


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBoth() {
        return both;
    }

    public void setBoth(Date both) {
        this.both = both;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", name='" + name + '\'' +
                ", speed='" + speed + '\'' +
                ", sex='" + sex + '\'' +
                ", both=" + both +
                '}';
    }
}
