package com.example.springboot08;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.example.springboot08.mapper")
@SpringBootApplication
public class Springboot08Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot08Application.class, args);
	}
}
