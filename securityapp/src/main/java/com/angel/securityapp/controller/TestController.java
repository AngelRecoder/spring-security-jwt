package com.angel.securityapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Este endpoint es público";
    }

    @GetMapping("/user/test")
    public String userEndpoint() {
        return "Este endpoint requiere rol USER";
    }

    @GetMapping("/admin/test")
    public String adminEndpoint() {
        return "Este endpoint requiere rol ADMIN";
    }
}
