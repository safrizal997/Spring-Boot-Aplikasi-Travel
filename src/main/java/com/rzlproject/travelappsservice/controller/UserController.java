package com.rzlproject.travelappsservice.controller;

import com.rzlproject.travelappsservice.entity.User;
import com.rzlproject.travelappsservice.model.UserRequest;
import com.rzlproject.travelappsservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUser (){
        return userService.getAllUser();
    }

    @GetMapping(path = "/{userid}")
    public User getUserById(@PathVariable("userid") Long userId){
        return userService.getUserById(userId);
    }

    @PostMapping
    public User addUser(@RequestBody UserRequest userRequest){
        return userService.addUser(userRequest);
    }

    @PutMapping(path = "/{userid}")
    public User updateUser(@RequestBody UserRequest userRequest,@PathVariable("userid") Long userId){
        return userService.updateUser(userRequest,userId);
    }

    @DeleteMapping(path = "/{userid}")
    public String deleteById(@PathVariable("userid") Long userId){
        return userService.deleteById(userId);
    }

}
