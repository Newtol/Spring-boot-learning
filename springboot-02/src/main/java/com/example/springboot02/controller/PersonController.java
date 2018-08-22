package com.example.springboot02.controller;

import com.example.springboot02.controller.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: REN
 * @Description:
 * @Date: Created in 0:19 2018/8/22
 */

@RestController
public class PersonController {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {
        return person;
    }
}