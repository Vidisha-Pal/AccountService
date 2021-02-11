package com.example.springMicroserviceAccountService;

import com.example.springMicroserviceAccountService.services.accounts.AccountsConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;

//@EnableAutoConfiguration
@EnableDiscoveryClient
@Import(AccountsConfiguration.class)
@SpringBootApplication(scanBasePackages = {"com.example.springMicroserviceAccountService"})
public class SpringMicroserviceAccountServiceApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "accounts-server");
		SpringApplication.run(SpringMicroserviceAccountServiceApplication.class, args);
	}

}
