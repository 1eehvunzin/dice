package com.example.dice.api;

import com.example.dice.dto.SurveyResponseDto;
import com.example.dice.entity.SurveyResponse;
import com.example.dice.entity.User;
import com.example.dice.service.SurveyResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyResponseCollectApiController { //응답 저장

    @Autowired
    SurveyResponseService surveyResponseService;

    @PostMapping("/survey/pages/response")
    public ResponseEntity<?> collect(@RequestBody SurveyResponseDto surveyResponseDto, @AuthenticationPrincipal User user) {
        SurveyResponse surveyResponse = surveyResponseService.saveResponse(surveyResponseDto, user);
        return (surveyResponse != null)
                ? ResponseEntity.ok(surveyResponse)
                : ResponseEntity.badRequest().build();
    }
}
