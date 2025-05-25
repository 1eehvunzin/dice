package com.example.dice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dice.entity.SurveyPage;


@Repository
public interface SurveyPageRepository extends JpaRepository<SurveyPage, Long> {



}
