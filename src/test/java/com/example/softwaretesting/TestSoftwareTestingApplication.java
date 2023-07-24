package com.example.softwaretesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSoftwareTestingApplication {

	public static void main(String[] args) {
		SpringApplication.from(SoftwareTestingApplication::main).with(TestSoftwareTestingApplication.class).run(args);
	}

}
