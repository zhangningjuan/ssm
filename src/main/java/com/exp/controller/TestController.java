package com.exp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class TestController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("测试");
        return "test";
    }
}
