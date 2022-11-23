package com.rnair.springreactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.rnair.springreactive.client.TickClient;

@SpringBootApplication
public class SpringReactiveApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringReactiveApplication.class, args);
		
		TickClient client = context.getBean(TickClient.class);
		client.subscribeTicks();
	}

}
