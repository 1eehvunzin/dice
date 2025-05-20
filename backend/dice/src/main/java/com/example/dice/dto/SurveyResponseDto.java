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

    private Boolean lifeSatisfaction;
    private Boolean lifeInterest;
    private Boolean lethargy;
    private Boolean loneliness;
    private Boolean emotionalInstability;

    private Boolean motorAbility;
    private Integer difficultyInActivities;

    private String sleepingDisorder;
    private String sleepWake;
    private String sleepingHour;

    private String drinkingFrequency;
    private String heavyDrinking;
    private String badDrinking;

    private String smoking;
    private String smokingAmount;

    private Integer height;
    private Integer weight;

    private String academicAbility;

    public SurveyResponse toEntity(){
        return new SurveyResponse(responseId, date, province, city, rememberedWords, fruits, lifeSatisfaction
        , lifeInterest, lethargy, loneliness, emotionalInstability, motorAbility, difficultyInActivities,
                sleepingDisorder, sleepWake, sleepingHour, drinkingFrequency, heavyDrinking, badDrinking,
                smoking, smokingAmount, height, weight, academicAbility);
    }
}
