package com.example.dice.entity;

import jakarta.persistence.*;

@Entity
public class RememberedWords {
    @Id
    @GeneratedValue
    private Long id;

    private String word;

    @ManyToOne
    @JoinColumn(name = "survey_response_id")
    private SurveyResponse surveyResponse;
}
