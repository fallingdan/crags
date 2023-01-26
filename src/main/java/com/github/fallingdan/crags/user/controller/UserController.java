package com.github.fallingdan.crags.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.fallingdan.crags.user.model.UserRegistrationRequest;
import com.github.fallingdan.crags.user.model.UserRegistrationResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @PostMapping(value = "/registration")
    public UserRegistrationResponse userRegistration(@RequestBody UserRegistrationRequest userRegistration) {

        return null;
    }

}
