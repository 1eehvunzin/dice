package com.example.dice.repository;

import com.example.dice.entity.ResponseAnalysis;
import com.example.dice.entity.SurveyPage;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResponseAnalysisRepository extends JpaRepository<ResponseAnalysis, Long> {
    @EntityGraph(attributePaths = "surveyResponse")
    Optional<ResponseAnalysis> findBySurveyResponse_ResponseId(Long responseId);

    
}
