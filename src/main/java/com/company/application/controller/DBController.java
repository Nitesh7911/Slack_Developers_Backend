package com.company.application.controller;

import com.company.application.model.Candidate;
import com.company.application.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://slack-developer-frontend.herokuapp.com")
public class DBController {

    @Autowired
    private CandidateRepository candidateRepository;

    @Value("${app.message}")
    private String welcomeMessage;

    @GetMapping("/welcome")
    public String getDataBaseConnectionDetails() {
        return welcomeMessage;
    }

    @RequestMapping("/")
    public String test_application() {
        return "Application Works!";
    }

    @RequestMapping("/test_db")
    public Candidate test_DB_Connection(){
        Candidate candidate=candidateRepository.findCandidate();
        return candidate;
    }
}
