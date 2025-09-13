package com.ndk.lldpractice.springboot.controller;

import com.ndk.lldpractice.springboot.dto.UserRequest;
import com.ndk.lldpractice.springboot.dto.UserResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1/api/user")
public interface UserController {

    @Operation(summary = "Create user")
    @PostMapping("/")
    ResponseEntity<UserResponse> createUser(
            @RequestBody UserRequest userRequest
    );

    @Operation(summary = "Get user")
    @GetMapping("/{userId}")
    ResponseEntity<UserResponse> getUser(
            @PathVariable UUID userId
    );
}
