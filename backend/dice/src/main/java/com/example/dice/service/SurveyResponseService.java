package com.example.dice.service;

import com.example.dice.dto.SurveyResponseDto;
import com.example.dice.entity.SurveyResponse;
import com.example.dice.repository.SurveyResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyResponseService {

    @Autowired
    private SurveyResponseRepository surveyResponseRepository;

    public SurveyResponse saveResponse (SurveyResponseDto surveyResponseDto) {
        SurveyResponse surveyResponse = surveyResponseDto.toEntity(); //dto를 폼으로 입력받은 후, 엔티티로 변환
        return surveyResponseRepository.save(surveyResponse); //리포지토리에 엔티티 저장
    }
}
