package com.example.dice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@Entity
public class SurveyResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @Column
    private LocalDate date;

    @Column
    private String province;
    @Column
    private String city;

    @ElementCollection
    @CollectionTable(name = "RememberedWords"/*, joinColumns = @JoinColumn(name = "survey_id")*/)
    private List<String> rememberedWords;

    @ElementCollection
    @CollectionTable(name = "fruits")
    private List<String> fruits;

    @Column
    private Boolean lifeSatisfaction;

    @Column
    private Boolean lifeInterest;

    @Column
    private Boolean lethargy;

    @Column
    private Boolean loneliness;

    @Column
    private Boolean emotionalInstability;

    @Column
    private Boolean motorAbility;
    @Column
    private Integer difficultyInActivities;

    @Column
    private String sleepingDisorder;

    @Column
    private String sleepWake;
    @Column
    private String sleepingHour;

    @Column
    private String drinkingFrequency;
    @Column
    private String heavyDrinking;
    @Column
    private String badDrinking;

    @Column
    private String smoking;
    @Column
    private String smokingAmount;

    @Column
    private Integer height;
    @Column
    private Integer weight;

    @Column
    private String academicAbility;
}
