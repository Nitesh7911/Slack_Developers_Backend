package com.company.application.repository;

import com.company.application.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

    @Query("select c from Candidate c where c.id=1")
    Candidate returnSingleCandidate();
}
