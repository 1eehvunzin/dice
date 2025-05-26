package com.example.dice.api;

import com.example.dice.entity.SurveyPage;
import com.example.dice.repository.SurveyPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class SurveyViewApiController { //설문조사 문항이 나타남

    @Autowired
    private SurveyPageRepository surveyPageRepository;

    @GetMapping("/survey/pages/{pageId}")
    public ResponseEntity<SurveyPage> viewSurveys(@PathVariable Long pageId) {
        SurveyPage surveyPage = surveyPageRepository.findById(pageId).orElse(null);
        return (surveyPage != null) ?
                ResponseEntity.status(HttpStatus.OK).body(surveyPage) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
