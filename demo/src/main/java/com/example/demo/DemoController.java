package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {


    @PostMapping ("/farewell")
    String farewell (@RequestBody FarewellName name){
        return " see u later " + name.getName();
    }

    @GetMapping ("/greet")
    String greet (@RequestParam String name){
        return "helllllooooo "+ name;
    }



}
