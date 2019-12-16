package org.market.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class CompanyServiceProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceProxyApplication.class, args);
	}

}
