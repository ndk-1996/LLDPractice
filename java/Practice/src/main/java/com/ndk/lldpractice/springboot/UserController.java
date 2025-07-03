package com.ndk.lldpractice.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Annotation;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Hello, health check success";
    }
}
