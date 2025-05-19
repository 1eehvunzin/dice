package com.example.dice.repository;

import com.example.dice.entity.SurveyPage;
import io.micrometer.observation.annotation.Observed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;



public interface SurveyPageRepository extends JpaRepository<SurveyPage, Long> {



}
