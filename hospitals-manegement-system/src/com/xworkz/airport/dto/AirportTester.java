package com.xworkz.airport.dto;

import com.xworkz.airport.AirportDTO;

public class AirportTester {

 public static void main(String[] args) {
	
	 AirportDTO dto = new AirportDTO();
	 dto.setId(2);
	 dto.setName("Ashu");
	 dto.setAddress("Bengaluru");
	 dto.setTerminals(5);
	 System.out.println(dto.getId()+" "+dto.getName()+"  "+dto.getAddress()+"  "+dto.getTerminals());
	 
}
		
	
}
