package org.market.company.controller;

import java.util.Map;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope//Beans annotated this way can be refreshed at runtime and any components that are using
public class CompanyController {
	
	
	@GetMapping("/config")
	public Map<String,Object> currentThread(){
		
		return Map.of("threadName",Thread.currentThread().getName());
	}

}
