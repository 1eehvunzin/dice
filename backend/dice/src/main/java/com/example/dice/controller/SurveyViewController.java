package com.example.dice.controller;

import com.example.dice.entity.SurveyPage;
import com.example.dice.repository.SurveyPageRepository;
import com.example.dice.repository.SurveyResponseRepository;
import com.example.dice.service.SurveyResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SurveyViewController {

    @Autowired
    private SurveyPageRepository surveyPageRepository;

    @Autowired
    private SurveyResponseRepository surveyResponseRepository;

    @GetMapping("/survey/pages/{pageId}")
    public String viewSurveys(@PathVariable Long pageId, Model model) {
        SurveyPage surveyPage = surveyPageRepository.findById(pageId).orElse(null);
        model.addAttribute("surveyPage", surveyPage);
        return "surveys";
    }
}
