package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public void createUser(@RequestBody UserDto userDto){

    }

    @PutMapping(value = "blockUserId={userId}")
    public void blockUser(@PathVariable Long userId){

    }

    @PutMapping(value = "{userId}")
    public void generateKey(@PathVariable Long userId){

    }

}