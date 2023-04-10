package com.xfactor.openlibrary.controllers;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("Hello")
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam String name, int num, float weight, char gen){
        return "Hello " + name + " YOB : " + num + " Weight : " + weight + " Gen : " + gen;
    }
    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable String name,@RequestParam int num,@RequestParam float weight,@RequestParam char gen){
        return "Hello " + name + " YOB : " + num + " Weight : " + weight + " Gen : " + gen;
    }
    @GetMapping("/helloo/{name}/{age}")
    public HashMap<String,String> sayMyName(@PathVariable String name,@PathVariable int age){
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("name", name);
        hm.put("age", String.valueOf(age));
        return hm;
    }
}
