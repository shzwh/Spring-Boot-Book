package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo.mapper")
@SpringBootApplication
public class MybatisCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisCurdApplication.class, args);
	}

}
