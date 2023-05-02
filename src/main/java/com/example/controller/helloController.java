package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class helloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String sayhello(){
        return "Hello World";
    }
    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String helloName(@PathVariable  String name){
        return "hello "+name;
    }
    @RequestMapping("/hello/name")
    @ResponseBody
    public String hello(@RequestParam List<String> name ){
        return "hello "+name;
    }


}
