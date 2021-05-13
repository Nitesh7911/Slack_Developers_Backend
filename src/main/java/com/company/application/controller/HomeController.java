package com.company.application.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/home")
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);

    @Value("${app.message}")
    private String welcomeMessage;

    @GetMapping("/welcome")
    public String welcomeMessage() {
        log.info("Inside welcomeMessage method");
        return welcomeMessage;
    }

    @GetMapping("/application")
    public String testApplication() {
        log.info("Inside testApplication method");
        return "Application Works!";
    }

}
