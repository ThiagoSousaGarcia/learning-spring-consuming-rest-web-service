package com.example.learningspringconsumingrestwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class LearningSpringConsumingRestWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringConsumingRestWebServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public String run(RestTemplate restTemplate) throws Exception {
		Quote quote = restTemplate.getForObject(
				"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		
		log.info("The response is: "+ quote.toString());
		log.info("The type is: " + quote.getType());
		log.info("The id is: " + quote.getValue().getId());
		log.info("The quote is: " + quote.getValue().getQuote());
		
		return quote.getType();
	}

}
