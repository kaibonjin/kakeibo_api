package com.api.kakeibo_api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HealthCheckController {
    @GetMapping(path = "/health_check")
    public String healthCheck() {
        return "health check ok";
    }
}
