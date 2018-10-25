package cn.newtol.springboot09.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 公众号：Newtol
 * @Description:
 * @Date: Created in 11:30 2018/10/25
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
