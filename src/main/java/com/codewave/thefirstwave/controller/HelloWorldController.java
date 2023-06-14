package com.codewave.thefirstwave.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/api/hw")
public class HelloWorldController {
    @GetMapping
    public HashMap<String, String> getMessage(){
        HashMap<String, String> resDict = new HashMap<>();
        resDict.put("Message", "Hello WOrld");
        return resDict;
    }
}
