package com.rnair.springreactive.server;

import java.time.Duration;

import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;

@Component
public class TickService {

	public Flux<Tick> emitTicks() {
		Flux<Tick> ticks = Flux.interval(Duration.ofSeconds(1))
				.map(t -> new Tick("FOO", String.valueOf(Math.random()).substring(0, 3)));

		return ticks;

	}
}
