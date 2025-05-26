package com.example.dice.service;

import com.example.dice.dto.AddUserRequest;
import com.example.dice.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.dice.repository.UserRepository;


@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto){
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword())) //패스워드 암호화
                .age(dto.getAge())
                .gender(dto.getGender())
                .name(dto.getName())
                .build()).getId();
    }
}