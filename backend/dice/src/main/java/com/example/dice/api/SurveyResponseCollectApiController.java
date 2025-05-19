package com.example.dice.api;

import com.example.dice.dto.SurveyResponseDto;
import com.example.dice.entity.SurveyResponse;
import com.example.dice.service.SurveyResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurveyResponseCollectApiController {

    @Autowired
    SurveyResponseService surveyResponseService;
    @PostMapping("/survey/pages/response")
    public ResponseEntity<SurveyResponse> collect (@RequestBody SurveyResponseDto surveyResponseDto){
        SurveyResponse surveyResponse = surveyResponseService.saveResponse(surveyResponseDto);
        return (surveyResponse != null) ?
                ResponseEntity.status(HttpStatus.OK).body(surveyResponse) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
