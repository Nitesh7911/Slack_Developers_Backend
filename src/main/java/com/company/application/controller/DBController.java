package com.company.application.controller;

import com.company.application.model.Candidate;
import com.company.application.repository.CandidateRepository;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DBController {

    @Autowired
    private CandidateRepository candidateRepository;

    @RequestMapping("/")
    public String test_application() {
        return "Application Works!";
    }

    @RequestMapping("/test_db")
    public String test_DB_Connection(){
        List<Candidate> listCandidates=candidateRepository.findById();
        System.out.println(listCandidates);
        Candidate candidate=listCandidates.get(0);
        System.out.println(candidate.getName());
        return candidate.getName();
    }
}
