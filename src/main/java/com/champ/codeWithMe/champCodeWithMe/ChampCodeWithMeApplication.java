package com.champ.codeWithMe.champCodeWithMe;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ChampCodeWithMeApplication {

	private static final Logger log = LoggerFactory.getLogger(ChampCodeWithMeApplication.class);

	public static void main(String[] args) {

		log.info("Application is Up");

		SpringApplication.run(ChampCodeWithMeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args){
		return runner ->{
			System.out.println("Hello World");
		};
	}

}
