package com.wat.typer.typer.controllers;

import com.wat.typer.typer.entities.User;
import com.wat.typer.typer.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
