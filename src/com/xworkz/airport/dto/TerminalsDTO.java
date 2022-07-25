package com.xworkz.airport.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TerminalsDTO {


	public TerminalsDTO() {
		System.out.println("TerminalsDTO object is created");
	}
	 private String name;
	 private int id;
	 private String type;
	 private int noOfGates;
	
	 
}
