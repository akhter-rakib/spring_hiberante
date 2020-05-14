package com.rakib.annotaion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.rakib.ForTuneService;

@Configuration
@PropertySource("classpath:studentInfo.properties")
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
