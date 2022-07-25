package com.xworkz.airport;

public class AirportDTO {
	
	public AirportDTO() {
		System.out.println("airport constuctor is created");
	}

	private int id;
	private String name;
	private String address;
	private int terminals;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTerminals() {
		return terminals;
	}
	public void setTerminals(int terminals) {
		this.terminals = terminals;
	}
	
	
}
