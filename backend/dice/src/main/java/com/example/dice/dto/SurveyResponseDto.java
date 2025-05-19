package com.example.dice.dto;

import com.example.dice.entity.SurveyResponse;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class SurveyResponseDto {

    private Long responseId;
    private LocalDate date;

    private String province;
    private String city;

    private List<String> rememberedWords;

    private List<String> fruits;

    public SurveyResponse toEntity(){
        return new SurveyResponse(responseId, date, province, city, rememberedWords, fruits);
    }
}
