package com.ndk.lldpractice.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/health")
public class HealthCheckController {

    @GetMapping("/")
    public String healthCheck() {
        return "Hello, health check success";
    }
}
