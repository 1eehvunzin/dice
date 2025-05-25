package com.example.dice.repository;

import com.example.dice.entity.SurveyResponse;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface SurveyResponseRepository extends JpaRepository<SurveyResponse, Long> {
}
