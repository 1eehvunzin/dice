package com.example.dice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SurveyResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responseId;

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




//    @Column
//    private Boolean lifeSatisfaction;
//
//    @Column
//    private Boolean lifeInterest;
//
//    @Column
//    private Boolean lethargy;
//
//    @Column
//    private Boolean loneliness;
//
//    @Column
//    private Boolean emotionalInstability;
//
//    @Column
//    private Boolean motorAbility;
}
