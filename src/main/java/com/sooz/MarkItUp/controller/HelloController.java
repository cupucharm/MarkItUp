package com.sooz.MarkItUp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping(value="/hello")
    public String hello(){
        //http://localhost:8081/sooz/hello
        return "Hello Sooz World";
    }
}
