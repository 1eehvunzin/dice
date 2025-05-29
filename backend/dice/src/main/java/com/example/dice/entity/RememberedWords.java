package com.example.dice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
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
