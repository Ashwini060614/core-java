import java.util.Scanner; 
 
class Library12Tester{
	public static void main(String a []){
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("the inter size of books are add");
		int size = sc.nextInt();
		Library12 ary = new Library12(size);
		
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
		     ary.getBooksDetalies();
		//System.out.println(term.getId()+"    "+term.getName()+"  ");
		System.out.println("enter the existingId ");
	 int existingId=sc.nextInt();
	 System.out.println("Enter the updatedName ");
	  String updatedName=sc.next();
	  ary.updateTerminalsNameById(existingId,updatedName);
	  ary.getBooksDetalies();
	  
	  	 System.out.println("updateName is successfull update");
		 System.out.println("Enter the existingName");
		 String existingName=sc.next();
		ary. deletTerminalesDetailsByName(existingName);
		System.out.println("existingName is successfully exist");
       ary.getBooksDetalies();
	   }
	   
		  
	}


	
