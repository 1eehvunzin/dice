package com.example.dice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SurveyPage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pageId;


}
