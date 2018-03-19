package com.example.demo.controller;

import org.aspectj.lang.annotation.Aspect;;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String Helloword(@RequestParam String txt) {
        return "hello" + txt + ";;;;";
    }

    @GetMapping(value = "/aoptest")
    public String aopTest() {
        return " AOP test success!";
    }

}
