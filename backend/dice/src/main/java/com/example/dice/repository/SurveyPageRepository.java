package com.example.dice.repository;

import com.example.dice.entity.SurveyPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SurveyPageRepository extends JpaRepository<SurveyPage, Long> {



}
