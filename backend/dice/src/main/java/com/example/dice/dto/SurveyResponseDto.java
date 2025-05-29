package com.example.dice.dto;

import com.example.dice.entity.RememberedWords;
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
    private String place;
    private String pronunciation;
    private Integer calculation;
    private List<String> rememberedWords;
    private String language;
    private String judgement;

    private Boolean lifeSatisfaction;
    private Boolean lethargy;
    private Boolean loneliness;
    private Boolean emotionalInstability;

    private String sleepingDisorder;
    private String sleepWake;
    private String sleepingHour;

    private String drinkingFrequency;
    private String heavyDrinking;
    private String badDrinking;

    private Integer height;
    private Integer weight;

    private Boolean motorAbility;
    private Integer difficultyInActivities;

    private String smoking;
    private String smokingAmount;

    private String academicAbility;

    private Boolean analyzed;

    public SurveyResponse toEntity() {
        SurveyResponse surveyResponse = SurveyResponse.builder()
                .responseId(responseId)
                .date(date)
                .place(place)
                .pronunciation(pronunciation)
                .calculation(calculation)
                .language(language)
                .judgement(judgement)
                .lifeSatisfaction(lifeSatisfaction)
                .lethargy(lethargy)
                .loneliness(loneliness)
                .emotionalInstability(emotionalInstability)
                .sleepingDisorder(sleepingDisorder)
                .sleepWake(sleepWake)
                .sleepingHour(sleepingHour)
                .drinkingFrequency(drinkingFrequency)
                .heavyDrinking(heavyDrinking)
                .badDrinking(badDrinking)
                .height(height)
                .weight(weight)
                .motorAbility(motorAbility)
                .difficultyInActivities(difficultyInActivities)
                .smoking(smoking)
                .smokingAmount(smokingAmount)
                .academicAbility(academicAbility)
                .analyzed(false)
                .build();

        if (rememberedWords != null) {
            List<RememberedWords> rememberedWordEntities = rememberedWords.stream()
                    .map(word -> {
                        RememberedWords rw = new RememberedWords();
                        rw.setWord(word);
                        rw.setSurveyResponse(surveyResponse);
                        return rw;
                    })
                    .toList();

            surveyResponse.setRememberedWords(rememberedWordEntities);
        }
        return surveyResponse;
    }
}
