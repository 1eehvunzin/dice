package com.example.dice.repository;


import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dice.entity.SurveyResponse;


@Repository
public interface SurveyResponseRepository extends JpaRepository<SurveyResponse, Long> {
}
