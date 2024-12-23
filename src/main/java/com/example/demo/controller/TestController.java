package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {


    @GetMapping("/")
    public String access() {
        return "Tu as accédés a la ressource visible";
    }

    @GetMapping("/prive")
    public String prive() {
        return "Tu as accédés a la ressource privée";
    }
}
