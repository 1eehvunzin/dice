package com.example.dice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseAnalysisApiController {

    @GetMapping("/analysis")
    public String analysis() {
        try {
            Process process = Runtime.getRuntime().exec("보건의료빅데이터.py");
        }
    }
}
