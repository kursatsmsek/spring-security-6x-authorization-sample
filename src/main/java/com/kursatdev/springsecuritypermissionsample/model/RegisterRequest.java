package com.kursatdev.springsecuritypermissionsample.model;

public record RegisterRequest(String name,
                              int age,
                              String email,
                              String password) {
}
