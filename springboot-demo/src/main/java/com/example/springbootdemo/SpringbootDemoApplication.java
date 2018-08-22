package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
  *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		//让Spring Boot运行起来
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
}

