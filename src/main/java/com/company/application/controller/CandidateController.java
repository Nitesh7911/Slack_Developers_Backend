package com.company.application.controller;

import com.company.application.model.Candidate;
import com.company.application.repository.CandidateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    private static final Logger log = LoggerFactory.getLogger(CandidateController.class);

    private final CandidateRepository candidateRepository;

    public CandidateController(CandidateRepository candidateRepository){
        this.candidateRepository=candidateRepository;
    }

    @GetMapping("/returnSingleCandidate")
    public Candidate returnSingleCandidate(){
        log.info("Inside returnSingleCandidate method");
        Candidate candidate=candidateRepository.returnSingleCandidate();
        return candidate;
    }

    @GetMapping("/returnAllCandidates")
    public List<Candidate> returnAllCandidates(){
        log.info("Inside returnAllCandidates method");
        List<Candidate> candidates=candidateRepository.findAll();
        return candidates;
    }
}
