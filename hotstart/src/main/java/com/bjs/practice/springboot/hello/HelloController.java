package com.bjs.practice.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/")
    public String index() {
        System.out.println("你好世界");
        System.out.println("Hello world");
        return "Greetings from Spring Boot!";
    }

}
