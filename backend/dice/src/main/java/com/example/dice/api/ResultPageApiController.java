package com.example.dice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultPageApiController {

    @GetMapping ("/surveys/response")
    public void viewResultPage() {

    }
}
