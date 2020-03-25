package com.example.learningspringconsumingrestwebservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
	private int id;
	private String quote;

	public void setId(int id) {
		this.id = id;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getQuote() {
		return quote;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Value{" + "id=" + id + ", quote='" + quote + '\'' + '}';
	}

}
