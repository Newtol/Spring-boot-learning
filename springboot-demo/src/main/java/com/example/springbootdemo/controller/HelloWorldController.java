package com.example.springbootdemo.controller;

        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: REN
 * @Description:
 * @Date: Created in 21:28 2018/8/18
 */

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
