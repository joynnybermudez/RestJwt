package com.example.auth;

import lombok.Data;

@Data
class AuthenticationRequest {
    
    private String email;
    String password;
    
}
