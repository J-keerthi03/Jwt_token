package com.example.SpringSecurityJwt.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthenticationResponse {

    @JsonProperty("token")
    private final String token;
    @JsonProperty("message")
    private String message;

    public AuthenticationResponse(String token, String message) {
        this.token = token;
        this.message = message;
    }

    public String getToken() {
        return token;
    }


    public String getMessage() {
        return message;
    }
}