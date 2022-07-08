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
		 
		 
			ary.creatbooks(not);
			//System.out.println(term.getId()+"    "+term.getName()+"  ");
			//sc.getTerminalsDetalies();
		}
		     ary.getBooksDetalies();
		//System.out.println(term.getId()+"    "+term.getName()+"  ");
	}


	
}