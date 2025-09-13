package com.ndk.lldpractice.springboot.repository;

import com.ndk.lldpractice.springboot.dto.UserRequest;
import com.ndk.lldpractice.springboot.exception.UserNotFoundException;
import com.ndk.lldpractice.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setEmail(userRequest.getEmail());
        user.setName(userRequest.getName());
        user.setUsername(userRequest.getUsername());
        user.setAddress(userRequest.getAddress());
        user.setPhoneNumber(userRequest.getPhoneNumber());

        users.add(user);
        return user;
    }

    public User getUser(UUID userId) {
        for (User user: users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new UserNotFoundException("User not found");
    }
}
