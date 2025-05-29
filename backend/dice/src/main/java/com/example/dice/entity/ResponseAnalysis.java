package com.example.dice.entity;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ResponseAnalysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 설문 응답과 1:1 매핑
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "survey_response_id")
    private SurveyResponse surveyResponse;

    // 최종 종합 점수 (게이지용)
    @Column(nullable = false)
    private Float gaugeScore;

    @Column(nullable = false)
    private Float finalRecognitionScore;

    @Column(nullable = false)
    private Float finalDepressionScore;

    @Column(nullable = false)
    private Float finalSleepingScore;

    @Column(nullable = false)
    private Float finalDrinkingScore;

    @Column(nullable = false)
    private Float finalBMIScore;

    @Column(nullable = false)
    private Float finalEducationScore;

    @Column(nullable = false)
    private Float finalExcerciseScore;

    @Column(nullable = false)
    private Float finalSmokingScore;
}