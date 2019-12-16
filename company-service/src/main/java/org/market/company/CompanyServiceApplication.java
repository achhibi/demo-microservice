package org.market.company;

import java.util.List;

import org.market.company.domain.Company;
import org.market.company.repository.CompanyRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class CompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompanyRespository respository) {
		return (args)->{
			List.of("Company 1", "Company 2", "Company 3").forEach(c->respository.save(new Company(null,c,100+Math.random()*900)));
			respository.findAll().forEach(System.out::println);
		};
	}
}
