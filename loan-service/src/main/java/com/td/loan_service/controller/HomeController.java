package com.td.loan_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Loan Service API is running");
        response.put("status", "UP");
        response.put("endpoints", Map.of(
            "health", "/actuator/health",
            "h2-console", "/h2-console",
            "actuator", "/actuator"
        ));
        return response;
    }
}

