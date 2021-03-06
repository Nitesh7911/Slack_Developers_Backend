package com.company.application.configuration;

import com.company.application.controller.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {

    private static final Logger log = LoggerFactory.getLogger(DBConfiguration.class);

    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Profile("dev")
    @Bean
    public String devDatabaseConnection() {
        log.info("Inside devDatabaseConnection method");
        System.out.println("DB connection for DEV - H2");
        System.out.println(url);
        return "DB connection for DEV - H2";
    }

    @Profile("test")
    @Bean
    public String testDatabaseConnection() {
        log.info("Inside testDatabaseConnection method");
        System.out.println("DB Connection to TEST - H2");
        System.out.println(url);
        return "DB Connection to TEST - H2";
    }

    @Profile("prod")
    @Bean
    public String prodDatabaseConnection() {
        log.info("Inside prodDatabaseConnection method");
        System.out.println("DB Connection to PROD - High Performance Instance");
        System.out.println(url);
        return "DB Connection to PROD - High Performance Instance";
    }
}
