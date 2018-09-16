package cn.newtol.springboot04.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: REN
 * @Description:
 * @Date: Created in 23:41 2018/9/15
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
