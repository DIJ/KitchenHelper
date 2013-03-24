package com.illusionwaregames.webapp.data;

public class Product {

	private String name;
	
	private String insertionDate;
	
	private String expirationDate;
	
	private int quantity;
	
	private String expirationStatus;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(String insertionDate) {
		this.insertionDate = insertionDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getExpirationStatus() {
		return expirationStatus;
	}

	public void setExpirationStatus(String expirationStatus) {
		this.expirationStatus = expirationStatus;
	}
	
	public Product withName(String name) {
		this.setName(name);
		return this;
	}
	
	public Product withInsertionDate(String insertionDate) {
		this.setInsertionDate(insertionDate);
		return this;
	}
	
	public Product withExpirationDate(String expirationDate) {
		this.setExpirationDate(expirationDate);
		return this;
	}
	
	public Product withQuantity(int quantity) {
		this.setQuantity(quantity);
		return this;
	}
	
	public Product withExpirationStatus(String expirationStatus) {
		this.setExpirationStatus(expirationStatus);
		return this;
	}
}
