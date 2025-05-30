package com.example.dice.service;

import com.example.dice.dto.SurveyResponseDto;
import com.example.dice.entity.SurveyResponse;
import org.springframework.stereotype.Service;
import com.example.dice.repository.SurveyResponseRepository;
import com.example.dice.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SurveyResponseService {

    @Autowired
    private SurveyResponseRepository surveyResponseRepository;

    public SurveyResponse saveResponse (SurveyResponseDto surveyResponseDto, User user) {
        SurveyResponse surveyResponse = surveyResponseDto.toEntity(); //dto를 폼으로 입력받은 후, 엔티티로 변환
        surveyResponse.setUser(user);
        return surveyResponseRepository.save(surveyResponse); //리포지토리에 엔티티 저장

    }
}