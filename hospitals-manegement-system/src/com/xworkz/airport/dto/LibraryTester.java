package com.xworkz.airport.dto;

import java.util.Scanner;

public class LibraryTester {
     public static void main(String[] args) {
	
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the airport id");
		 int id=sc.nextInt();
		 System.out.println("Enter the airport name");
		 String  name=sc.next();
		 System.out.println("Enter the airport location");
		 String location =sc.next();
		 System.out.println("Enter the airport contactNo");
		 long contactNo =sc.nextLong();
		 
    	 LibraryDTO dto = new LibraryDTO();
    	 dto.setId(id);
    	 dto.setName(name);
    	 dto.setLocation(location);
    	 dto.setContactNo(contactNo);
    	 System.out.println(dto.getId()+" "+dto.getName()+"  "+dto.getLocation()+"  "+dto.getContactNo());
    	 
    	 sc.close();
}
     
}
