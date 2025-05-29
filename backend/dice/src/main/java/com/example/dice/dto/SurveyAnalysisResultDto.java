package com.example.dice.dto;

import com.example.dice.entity.ResponseAnalysis;
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

    public static SurveyAnalysisResultDto fromEntity(ResponseAnalysis analysis) {
        SurveyAnalysisResultDto dto = new SurveyAnalysisResultDto();
        dto.setGaugeScore(analysis.getGaugeScore());

        float total = analysis.getGaugeScore();
        float recog = analysis.getFinalRecognitionScore();
        float depr = analysis.getFinalDepressionScore();

        // 1. summaryText – 총합 점수 기준
        if (total <= 20) {
            dto.setSummaryText(List.of(
                    "전반적으로 매우 건강한 상태로 평가됩니다.",
                    "인지기능, 수면, 감정 상태 등이 안정적으로 유지되고 있습니다.",
                    "현재의 생활 습관을 꾸준히 유지하시는 것이 좋습니다."
            ));
        } else if (total <= 50) {
            dto.setSummaryText(List.of(
                    "현재 설문 결과는 일부 인지기능 관련 영역에서 변화의 신호가 관찰되고 있으며,",
                    "그 변화가 아직은 생활에 큰 불편을 주지는 않지만, 인지 저하의 시작점을 시사할 수 있는 수준입니다.",
                    "지금의 상태를 기회로 삼아, 뇌 건강을 위한 일상 습관을 조금씩 개선해 보시길 바랍니다."
            ));
        } else {
            dto.setSummaryText(List.of(
                    "현재 여러 항목에서 높은 리스크가 확인되었습니다.",
                    "인지기능, 수면, 감정, 건강 상태 전반에 걸쳐 점검이 필요합니다.",
                    "전문가의 상담이나 정기적인 건강 검진을 권장합니다."
            ));
        }

        // 2. clusterDescList – 인지/우울 점수 조합
        if (recog > 60 && depr > 60) {
            dto.setClusterDescList(List.of(
                    "인지-우울형 클러스터는 인지기능 저하와 정서적 기복이 동시에 나타나는 유형입니다.",
                    "기억력 저하, 수면장애, 무기력감 등이 함께 관찰될 수 있으며, 정서적 지지와 인지 자극의 병행이 중요합니다."
            ));
        } else if (depr > 60) {
            dto.setClusterDescList(List.of(
                    "정서우울형 클러스터는 감정 기복과 무기력, 수면 질 저하가 주요 특징입니다.",
                    "사회적 교류를 늘리고 긍정적인 자극을 받을 수 있는 환경 조성이 도움이 됩니다."
            ));
        } else if (recog > 60) {
            dto.setClusterDescList(List.of(
                    "인지저하형 클러스터는 주로 기억력, 판단력, 집중력의 감소가 나타나는 유형입니다.",
                    "지적 자극 활동과 일상 구조화, 반복 학습이 도움이 될 수 있습니다."
            ));
        } else {
            dto.setClusterDescList(List.of(
                    "위험 신호가 다소 낮거나 분산되어 있어 명확한 클러스터는 확인되지 않습니다.",
                    "다양한 항목의 점검이 함께 필요하며, 꾸준한 루틴 관리가 중요합니다."
            ));
        }

        // 3. routineList – 항상 고정된 추천 또는 조건부로 추천 다양화 가능
        dto.setRoutineList(List.of(
                "아침 햇빛 15분 + 가벼운 걷기",
                "하루 1퍼즐 또는 1페이지 독서",
                "오늘 있었던 일 3줄로 적기",
                "저녁엔 휴대폰 대신 음악이나 라디오 듣기",
                "하루 1명에게 안부 전화하기",
                "식사는 색깔 있게, 단백질은 꼭 챙기기",
                "수면을 위한 루틴 만들기"
        ));

        // 4. score 목록 (단순 매핑)
        dto.setScores(List.of(
                new ScoreInfo("인지기능", recog, 100, recog > 60 ? "기억력 저하가 뚜렷하게 나타납니다." : "인지 기능이 비교적 안정적입니다."),
                new ScoreInfo("우울감", depr, 100, depr > 60 ? "정서적 불안정이 관찰됩니다." : "우울감 리스크는 낮은 편입니다."),
                new ScoreInfo("수면", analysis.getFinalSleepingScore(), 100, "수면 습관 개선이 필요할 수 있습니다."),
                new ScoreInfo("음주", analysis.getFinalDrinkingScore(), 100, "절주가 권장됩니다."),
                new ScoreInfo("BMI", analysis.getFinalBMIScore(), 100, "체중 관리가 필요합니다."),
                new ScoreInfo("교육수준", analysis.getFinalEducationScore(), 100, "인지 예비력 향상을 위해 지적 활동이 중요합니다."),
                new ScoreInfo("운동", analysis.getFinalExcerciseScore(), 100, "활동량 유지를 위한 노력이 필요합니다."),
                new ScoreInfo("흡연", analysis.getFinalSmokingScore(), 100, "금연이 건강에 도움이 됩니다.")
        ));

        return dto;
    }
}