package com.microservice.currencyexchange.beans;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class currencyconversion {
	@Id
	private long id;
	
	@Column(name = "currency_from")
	private  String from;
	@Column(name = "currency_to")
	private String to;
	private BigDecimal conversionMultiple;
	private int quantity;
	private double totalCalAmount;
	private String environment;
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public currencyconversion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public currencyconversion(long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public currencyconversion(long id, String from, String to, BigDecimal conversionMultiple, int quantity,
			double totalCalAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalAmount = totalCalAmount;
		this.environment = environment;
	}
	public double getTotalCalAmount() {
		return totalCalAmount;
	}
	public void setTotalCalAmount(double totalCalAmount) {
		this.totalCalAmount = totalCalAmount;
	}
	
	

}
