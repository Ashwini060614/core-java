package com.xworkz.hospital.dto;

public class HospitalTester {

	public static void main(String[] args) {
		PatientDTO dto= new PatientDTO();
		dto.setId(2);
		dto.setName("Ashu");
		dto.setAddress("bgk");
		dto.setContactNo(1234567890L);
		System.out.println(dto);

	}

}
