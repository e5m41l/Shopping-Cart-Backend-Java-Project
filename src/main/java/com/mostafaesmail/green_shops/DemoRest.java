package com.mostafaesmail.green_shops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoRest {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }
}
