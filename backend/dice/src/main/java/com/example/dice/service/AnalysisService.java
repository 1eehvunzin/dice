package com.example.dice.service;

import com.example.dice.dto.ScoreInfo;
import com.example.dice.dto.SurveyAnalysisResultDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisService {
    public SurveyAnalysisResultDto generateForm(SurveyAnalysisResultDto dto){
        SurveyAnalysisResultDto result = new SurveyAnalysisResultDto();

        result.setGaugeScore((float) (Math.random()*100));

        result.setSummaryText("인지 기능은 양호하나 스트레스 지수가 조금 높습니다.");
        
        result.setClusterDescList(List.of(
                "본 유형은 일상 기능은 유지하나 감정 기복이 있음",
                "예방을 위한 활동 필요"
        ));
        
        List<ScoreInfo> scores = List.of(
                new ScoreInfo("기억력",8f,10f,"양호한 편"),
                new ScoreInfo("주의력",5f,10f,"집중력이 다소 떨어짐"),
                new ScoreInfo("정서 안정성", 3f, 10f, "우울 지수가 높음")
        );
        result.setScores(scores);

        result.setRoutineList(List.of(
                "매일 10분 기억 회상 훈련",
                "산책하며 주변 사물 기억하기",
                "하루 1번 감사일기 쓰기"
        ));

        return result;
    }
}
