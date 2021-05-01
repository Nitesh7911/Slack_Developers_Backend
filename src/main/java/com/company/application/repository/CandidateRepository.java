package com.company.application.repository;

import com.company.application.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    @Query("select * from slack_developers.CANDIDATE_DETAILS")
    List<Candidate> findAll();
}
