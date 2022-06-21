class Library {
 int libraryId;
 long contactNo;
 String location;


  public Library (int id,String loc,long cNo){
  
  System.out.println(" Library object is created");
  this.libraryId=id;
 this.location=loc;
 this.contactNo=cNo;
  
  }
    public static void main(String a[]){
	
	Library library =new Library(1,"Basaveshwarnagr",8123808006L);
	System.out.println(library.libraryId+"  "+library.location+"  "+library.contactNo);
	
	Library library1=new Library(2,"Vijayanagarnagar",8660646713L);
	 System.out.println(library1.libraryId+"  "+library1.location+"  "+library1.contactNo);
	
	Library library2 =new Library(3,"MagadiRoad",8123808007L);
	System.out.println(library2.libraryId+"  "+library2.location+"  "+library2.contactNo);
	
	Library library3=new Library(4,"Jayanagar",8660646712L);
	 System.out.println(library3.libraryId+"  "+library3.location+"  "+library3.contactNo);
	
	Library library4=new Library(5,"Hanpinagar",8660646711L);
	 System.out.println(library4.libraryId+"  "+library4.location+"  "+library4.contactNo);
	
	
	
	
 }
 
 

}

