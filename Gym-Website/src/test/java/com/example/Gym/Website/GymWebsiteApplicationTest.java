package com.example.Gym.Website;

import com.example.Gym.Website.GymWebsiteApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest(classes = GymWebsiteApplication.class)
@TestPropertySource(properties = "spring.main.allow-bean-definition-overriding=true")
public class GymWebsiteApplicationTest {

	@Test
	public void contextLoads() {
		// This test method is used to ensure that the application context loads without errors
	}
}
