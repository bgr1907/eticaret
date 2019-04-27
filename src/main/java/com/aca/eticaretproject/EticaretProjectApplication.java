package com.aca.eticaretproject;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EticaretProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(EticaretProjectApplication.class, args);
	}
	@Bean
	public ModelMapper getModelMapper(){

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}
}
