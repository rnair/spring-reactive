package com.rnair.springreactive.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.rnair.springreactive.server.Tick;

@Component
public class TickClient {

	private final WebClient client;

	public TickClient(WebClient.Builder builder) {
		this.client = builder.baseUrl("http://localhost:8080").build();
	}

	public void subscribeTicks() {
		this.client.get().uri("/ticks").retrieve().bodyToFlux(Tick.class).subscribe(System.out::println);
	}
}
