package com.example.dice.dto;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class AddUserRequest {
    private String email;
    private String password;
}
