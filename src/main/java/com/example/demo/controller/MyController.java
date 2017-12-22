package com.example.demo.controller;

import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;
    @GetMapping("/my/test")
    public Object myTest(@RequestParam("a1") Integer a1, @RequestParam("a2") Integer a2) {
        myService.myTest(a1, a2);
        return "ok";
    }
}
