package com.ndk.lldpractice.springboot.controller;

import com.ndk.lldpractice.springboot.dto.UserRequest;
import com.ndk.lldpractice.springboot.dto.UserResponse;
import com.ndk.lldpractice.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Autowired
    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<UserResponse> createUser(UserRequest userRequest) {
        return ResponseEntity.ok(userService.createUser(userRequest));
    }

    @Override
    public ResponseEntity<UserResponse> getUser(UUID userId) {
        return ResponseEntity.ok(userService.getUser(userId));
    }
}
