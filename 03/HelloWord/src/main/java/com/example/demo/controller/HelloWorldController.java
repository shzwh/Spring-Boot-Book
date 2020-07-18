package com.example.demo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello()  throws Exception{

        log.info("log4j test!!!");
        return "HelloWorld ,Spring Boot!";
    }
}
