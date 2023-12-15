package com.kursatdev.springsecuritypermissionsample.controller;

import com.kursatdev.springsecuritypermissionsample.model.AuthResponse;
import com.kursatdev.springsecuritypermissionsample.model.LoginRequest;
import com.kursatdev.springsecuritypermissionsample.model.RegisterRequest;
import com.kursatdev.springsecuritypermissionsample.service.AuthService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest registerRequestDto) {
        return ResponseEntity.ok(authService.login(registerRequestDto));
    }

    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest registerRequestDto) {
        return ResponseEntity.ok(authService.register(registerRequestDto));
    }
}
