package com.fac.springboot.demo.firstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Value("${hello.world}")
    private String HelloWorld;

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World213";
    }


}
