package com.xworkz.library.curd;

import com.xworkz.library.dto.BooksDTO;

public interface Library {

	public boolean creatbooks(BooksDTO not);
	public void getBooksDetalies();
	 public boolean updateBookssNameById(int id,String name);
	 public boolean updateBooksContactNoById(int id,long contactNo);
	 public boolean deletBooksDetailsByName(String name);
	 public boolean deletBooksDetailsById(int id);
	
}
