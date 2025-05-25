package com.example.dice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScoreInfo {
    private String label;         // 항목 이름 (예: "기억력")
    private float score;          // 실제 점수
    private float maxScore;       // 최대 점수
    private String explanation;   // 해석 텍스트 (예: "양호한 편")
}
