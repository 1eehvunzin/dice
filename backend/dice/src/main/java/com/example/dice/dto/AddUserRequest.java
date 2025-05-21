package com.example.dice.dto;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Getter
@Service
public class AddUserRequest {
    private String email;
    private String password;
}
