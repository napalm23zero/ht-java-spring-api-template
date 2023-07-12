package dev.hustletech.htjavaspringapitemplate.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "hello", path = "/hello", produces = "application/json")
public class HelloWorldController {

    @GetMapping(value = "/", produces = "text/plain")
    public String sayHello() {
        return "Hello Rodrigo";
    }
}
