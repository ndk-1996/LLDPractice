package com.ndk.lldpractice.springboot.service;

import com.ndk.lldpractice.springboot.dto.UserRequest;
import com.ndk.lldpractice.springboot.dto.UserResponse;

import java.util.UUID;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);
    UserResponse getUser(UUID userId);
}
