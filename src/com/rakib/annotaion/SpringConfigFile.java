package com.rakib.annotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.rakib.ForTuneService;

@Configuration
public class SpringConfigFile {

	@Bean
	public SadFortune sadFortune() {
		return new SadFortune();
	}

	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(sadFortune());
	}

}
