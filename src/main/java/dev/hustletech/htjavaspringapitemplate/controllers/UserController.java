package dev.hustletech.htjavaspringapitemplate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.hustletech.htjavaspringapitemplate.services.UserService;

@RestController
@RequestMapping(name = "user", path = "/user", produces = "application/json")
public class UserController {

    @Autowired
    UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = "/", produces = "text/plain")
    public String getUser() {
        return service.get("pt-br");
    }

    @PostMapping(value = "/", produces = "text/plain")
    public String createUser() {
        return service.create("en-us");
    }

    @PutMapping(value = "/", produces = "text/plain")
    public String updateUser() {
        return service.update("pt-br");
    }

    @DeleteMapping(value = "/", produces = "text/plain")
    public String deleteUser() {
        return service.delete("pt-br");
    }

}
