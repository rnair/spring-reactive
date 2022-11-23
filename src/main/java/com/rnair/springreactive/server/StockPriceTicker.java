package com.rnair.springreactive.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class StockPriceTicker {

	@Autowired
	private TickService service;

	@GetMapping(value = "/ticks", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Tick> tick() {
		return service.emitTicks();
	}
}
