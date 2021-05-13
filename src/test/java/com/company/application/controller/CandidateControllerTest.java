package com.company.application.controller;

import org.junit.Assert;
import org.junit.Test;
//Need to write test methods
public class CandidateControllerTest {

    @Test
    public void returnSingleCandidateTest() {
        Assert.assertEquals("returnSingleCandidate","returnSingleCandidate");
    }

    @Test
    public void returnAllCandidatesTest() {
        Assert.assertEquals("returnAllCandidates","returnAllCandidates");
    }
}