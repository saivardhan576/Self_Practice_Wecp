package com.ltim.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.helloworld.Entity.HelloWorldBean;

@RestController
@RequestMapping("hello")
public class HelloWorld {

    @GetMapping("/sai")
    public String hello(){
        return "Welcome Manikantan- The topper of the batch";
    }

    @GetMapping("/sai-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Helloworld");
    }

    @GetMapping("path-variable/{name}")
    public HelloWorldBean hellowWorldPath(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World,%s",name));

    }

    @GetMapping("sum/{n1}/{n2}")
    public String hellowWorldPath1(@PathVariable int  n1,@PathVariable int n2){
        return "The Sum is"+(n1+n2);

    }
    
}

