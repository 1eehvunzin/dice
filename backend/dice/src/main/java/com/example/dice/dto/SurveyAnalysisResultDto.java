package com.example.dice.dto;

import lombok.Setter;
import lombok.Getter;


import java.util.List;

@Setter
@Getter
public class SurveyAnalysisResultDto {
    private float gaugeScore;
    private List<String> summaryText;
    private List<String> clusterDescList;
    private List<String> routineList;
    private List<ScoreInfo> scores;
}