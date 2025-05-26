package com.example.dice.dto;

import jakarta.persistence.Column;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class AddUserRequest {
    private String email;
    private String password;
    private String name;
    private Integer age;
    private String gender;
}
