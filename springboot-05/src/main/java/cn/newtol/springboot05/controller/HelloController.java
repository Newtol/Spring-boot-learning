package cn.newtol.springboot05.controller;


import cn.newtol.springboot05.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author: REN
 * @Description:
 * @Date: Created in 12:16 2018/9/17
 */
//@Controller
//@ResponseBody
@RestController
@RequestMapping(value = "/test")

public class HelloController {
//
//    @RequestMapping(value = "/hello" ,method = RequestMethod.GET,produces = "application/json; charset=UTF-8")
//    @GetMapping("/hello")                             //路由简写
//    @RequestMapping(value = {"/hello","hello2"})     //多个URL访问同一方法
//
//    public String hello(){
//        return "hello";
//    }
//
//    @RequestMapping(value = "/hello/{phone}/{name}")       //PathVariable多参数获取
//    public String phone(@PathVariable(value = "phone") Integer myPhone,@PathVariable String name){
//        return "电话："+ myPhone +"\n"+ "姓名: " + name;
//    }
//
//    @RequestMapping(value = "/hello")              //RequestParam 默认值设置
//    public Integer phone(@RequestParam(value = "phone",required = false,defaultValue = "139") Integer myPhone){
//        return myPhone;
//    }

//    @RequestMapping(value = "/hello",method = RequestMethod.POST)       //@RequestBody的测试
//    public String hello( @RequestBody String str){
//        return str;
//    }

    //实体类使用
//    @RequestMapping(value = "/person",method = RequestMethod.GET)      //json的使用
//    public Person person(){
//        Person person = new Person("ABC",456);
//        return person;
//    }

    //List测试
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<String> list(){
        List<String> lists = new ArrayList<>();
        lists.add("abc");
        lists.add("cdf");
        return lists;
    }
}
