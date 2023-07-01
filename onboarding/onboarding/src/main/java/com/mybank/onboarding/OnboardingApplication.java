package com.mybank.onboarding;

import ch.qos.logback.core.net.server.ConcurrentServerRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OnboardingApplication {

	public static void main(String[] args) {

		SpringApplication.run(OnboardingApplication.class, args);


	}

}
