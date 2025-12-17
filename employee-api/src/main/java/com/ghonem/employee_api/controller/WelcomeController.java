package com.ghonem.employee_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
        @GetMapping("/")
        public String home() {
            return "Welcome to the Employee API";
        }
}
