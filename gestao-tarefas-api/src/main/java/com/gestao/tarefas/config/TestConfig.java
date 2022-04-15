package com.gestao.tarefas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.gestao.tarefas.service.DbService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DbService dbService;
	
	@Bean
	public void instaciaBaseDeDados() {
		this.dbService.instaciaBaseDeDados();
		
	}

}
