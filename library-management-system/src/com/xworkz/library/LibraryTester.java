package com.xworkz.library;

import java.util.Scanner;

import com.xworkz.library.curd.Library;
import com.xworkz.library.curd.impl.LibraryImpl;
import com.xworkz.library.dto.BooksDTO;

public class LibraryTester {

public static void main(String a []){
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("the inter size of books are add");
		int size = sc.nextInt();
		Library ary = new LibraryImpl(size);
		
		for(int i=0; i<size; i++){
		System.out.println("the inter books id");
         int id= sc.nextInt();
		System.out.println("the inter books name");
		String name=sc.next();
         System.out.println("the inter books author");
         String author = sc.next();
		System.out.println("the inter books contactNo");
		long contactNo=sc.nextLong();

    	BooksDTO not = new BooksDTO();
	     not.setId(id);
		 not.setAuthor(author);
		 not.setContactNo(contactNo);
		 not.setName(name);
		 
			ary.creatbooks(not);
			//System.out.println(term.getId()+"    "+term.getName()+"  ");
			//sc.getTerminalsDetalies();
		}
		String option=null;
		do{
			System.out.println("Enter 1 to fetch all the books");
			System.out.println("Enter 2 to updateBooksNameById");
			System.out.println("Enter 3 to updateBooksContactNoById");
			System.out.println("Enter 4 to deleteBooksDetailsById");
			System.out.println("Enter 5 to deleteBooksDetailsByName");;
			
						System.out.println("Enter the choise");
						int choise=sc.nextInt();
						switch(choise){
							    case 1: ary.getBooksDetalies();
							         break;
								case 2: System.out.println("The inter updatedName name");
	                                     String updatedName=sc.next();
                                         System.out.println("the inter existingId ");
                                         int existingId= sc.nextInt();
		                                 ary.updateBookssNameById(existingId,updatedName);
							              break;
						
							   case 3:  System.out.println("The inter updatedName1 name");
	                                     long updatedContactNo=sc.nextLong();
                                         System.out.println("the inter updatedContactNo ");
                                         int existingId1= sc.nextInt();
                                         ary.updateBooksContactNoById(existingId1,updatedContactNo);
										 break;
										 
								case 4: System.out.println("the inter existingId2 ");
                                        int existingId2= sc.nextInt();
										ary.deletBooksDetailsById(existingId2);
										break;
										
								case 5:  System.out.println("The inter existingName name");
	                                      String existingName=sc.next();
		                                  ary.deletBooksDetailsByName(existingName);
		                                    break;
										
                            default: System.out.println("Given choise can not be deliverd");
							           break;
						}	
						sc.close();
			System.out.println("Do you want to continoue to enter Y/N ");
				option=sc.next();
		           }
				   while(option.equals("Y"));
}	 
		
	   
		  
	

}
