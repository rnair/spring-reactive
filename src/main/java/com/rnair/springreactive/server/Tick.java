package com.rnair.springreactive.server;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Tick implements Serializable{

	private static final long serialVersionUID = 7236744095428430796L;
	private String symbol;
	private String price;
	private String timestamp;

	public Tick(String symbol, String price) {
		super();
		this.symbol = symbol;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTimestamp() {
		return LocalDateTime.now().toString();
	}
	
	@Override
	public String toString() {
		return "Tick [symbol=" + symbol + ", price=" + price + ", timestamp=" + timestamp + "]";
	}

}
