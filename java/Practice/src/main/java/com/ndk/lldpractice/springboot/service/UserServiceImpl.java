package com.ndk.lldpractice.springboot.service;

import com.ndk.lldpractice.springboot.dto.UserRequest;
import com.ndk.lldpractice.springboot.dto.UserResponse;
import com.ndk.lldpractice.springboot.model.User;
import com.ndk.lldpractice.springboot.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User user = userRepository.createUser(userRequest);

        return getResponse(user);
    }

    @Override
    public UserResponse getUser(UUID userId) {
        User user = userRepository.getUser(userId);

        return getResponse(user);
    }

    private UserResponse getResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setName(user.getName());
        userResponse.setAddress(user.getAddress());
        userResponse.setEmail(user.getEmail());
        userResponse.setPhoneNumber(user.getPhoneNumber());
        userResponse.setUsername(user.getUsername());

        return userResponse;
    }
}
