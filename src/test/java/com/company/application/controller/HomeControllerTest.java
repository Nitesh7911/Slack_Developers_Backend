package com.company.application.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.ReflectionTestUtils;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@TestPropertySource(properties = {
        "app.message=This is the primary Application Property for Slack_Developers_Backend",
})
public class HomeControllerTest {

    private HomeController homeController;

    @Value("${app.message}")
    private String welcomeMessage;

    @Before
    public void setUp() {
        this.homeController = new HomeController();
        ReflectionTestUtils.setField(homeController, "welcomeMessage", "This is the primary Application Property for Slack_Developers_Backend");
    }

    @Test
    public void welcomeMessageTest() {
        assertThat(homeController.welcomeMessage().equals("This is the primary Application Property for Slack_Developers_Backend"));
    }

    @Test
    public void testApplicationTest() {
        assertThat(homeController.testApplication().equals("Application Works!"));
    }
}
