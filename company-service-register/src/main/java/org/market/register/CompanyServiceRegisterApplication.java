package org.market.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CompanyServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceRegisterApplication.class, args);
	}

}
