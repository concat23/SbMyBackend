package com.dev.sbmodule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> checkHealth() {
        Map<String, String> healthStatus = new HashMap<>();
        healthStatus.put("status", "UP");
        return healthStatus;
    }
}