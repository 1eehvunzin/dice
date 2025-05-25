package com.example.dice.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SurveyAnalysisResultDto {
    private float gaugeScore;
    private String summaryText;
    private List<String> clusterDescList;
    private List<String> routineList;
    private List<ScoreInfo> scores;

}
