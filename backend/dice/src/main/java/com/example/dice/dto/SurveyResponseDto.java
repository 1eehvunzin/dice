package com.example.dice.dto;

import com.example.dice.entity.SurveyResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    public SurveyResponse toEntity() {
        return SurveyResponse.builder()
                .responseId(responseId)
                .date(date)
                .province(province)
                .city(city)
                .rememberedWords(rememberedWords)
                .fruits(fruits)
                .lifeSatisfaction(lifeSatisfaction)
                .lifeInterest(lifeInterest)
                .lethargy(lethargy)
                .loneliness(loneliness)
                .emotionalInstability(emotionalInstability)
                .motorAbility(motorAbility)
                .difficultyInActivities(difficultyInActivities)
                .sleepingDisorder(sleepingDisorder)
                .sleepWake(sleepWake)
                .sleepingHour(sleepingHour)
                .drinkingFrequency(drinkingFrequency)
                .heavyDrinking(heavyDrinking)
                .badDrinking(badDrinking)
                .smoking(smoking)
                .smokingAmount(smokingAmount)
                .height(height)
                .weight(weight)
                .academicAbility(academicAbility)
                .build();
    }
}
