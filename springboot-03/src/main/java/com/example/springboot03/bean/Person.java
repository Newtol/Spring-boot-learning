package com.example.springboot03.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: REN
 * @Description:
 * @Date: Created in 0:25 2018/8/22
 */

@Component
//@Validated   //增加@Validated 进行验证
@ConfigurationProperties(prefix = "person")  //使用@ConfigurationProperties来支持松散绑定
public class Person {

//     @Value("${person.name}")
//    @Value("${person.Name}")     将 @Value("${person.name}") 更改为@Value("${person.Name}")   发现@Value不支持松散绑定
//    @Email  //对name字段进行邮箱验证
    private String name;
//    @Value("#{2*18}")
    private Integer age;
//    @Value("2018/08/24")
    private Date birth;
    private List<Object> list;
    private Map<String,Object> maps;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                ", list=" + list +
                ", maps=" + maps +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
