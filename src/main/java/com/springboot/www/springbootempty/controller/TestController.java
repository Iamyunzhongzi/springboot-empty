package com.springboot.www.springbootempty.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/hello")
    public String printfHello () {
        return "hello springboot!";
    }
}
