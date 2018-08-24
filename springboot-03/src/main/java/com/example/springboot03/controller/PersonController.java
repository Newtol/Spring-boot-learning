package com.example.springboot03.controller;

import com.example.springboot03.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: REN
 * @Description:
 * @Date: Created in 15:41 2018/8/24
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