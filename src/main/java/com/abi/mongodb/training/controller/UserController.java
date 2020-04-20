package com.abi.mongodb.training.controller;

import com.abi.mongodb.training.models.User;
import com.abi.mongodb.training.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.StringJoiner;

@RestController
@Api(value = "UserController")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "Get users")
    @GetMapping(value="/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable String id) {
        return userService.getUser(id);
    }

    @ApiOperation(value = "Add users")
    @PostMapping(value = "/users/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public String addUser(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
                          @RequestParam("email") String email, Model model) {
        User user = User.builder().firstName(firstName).lastName(lastName).email(email).build();
        String id = userService.addUser(user);
        return id;
    }
}