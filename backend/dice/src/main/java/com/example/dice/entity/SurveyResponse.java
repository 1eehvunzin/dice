package com.example.dice.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;



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
    
    //인지 기능

    @Column
    private LocalDate date; //시간지남력
    @Column
    private String place; //장소지남력
    @Column
    private String pronunciation; //기억등록
    @Column
    private Integer calculation; //주의집중 및 계산
    @OneToMany(mappedBy = "surveyResponse", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RememberedWords> rememberedWords;
    @Column
    private String language; //언어 기능
    @Column
    private String judgement; //이해 및 판단

    @Column
    private Boolean lifeSatisfaction; //만족
    @Column
    private Boolean lethargy; //무기력
    @Column
    private Boolean loneliness; //사회적 단절
    @Column
    private Boolean emotionalInstability; //정서적 불안정

    @Column
    private String sleepingDisorder; //잠들기까지 걸리는 시간
    @Column
    private String sleepWake; //수면 중 각성
    @Column
    private String sleepingHour; //수면 시간

    @Column
    private String drinkingFrequency; //음주 빈도
    @Column
    private String heavyDrinking; //과음 여부
    @Column
    private String badDrinking; //해로운 음주 여부

    @Column
    private Integer height;
    @Column
    private Integer weight;


    @Column
    private Boolean motorAbility; //계단 10개
    @Column
    private Integer difficultyInActivities;

    @Column
    private String smoking;
    @Column
    private String smokingAmount;

    @Column
    private String academicAbility;

    @Column(nullable = false)
    private Boolean analyzed = false;


}
