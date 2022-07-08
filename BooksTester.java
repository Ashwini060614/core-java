import java.util.Scanner; 
 
class LibraryTester{
	public static void main(String a []){
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("the inter size of books are add");
		int size = sc.nextInt();
		Library ary = new Library(size);
		
		for(int i=0; i<size; i++){
		System.out.println("the inter books id");
         int id= sc.nextInt();
		System.out.println("the inter books name");
		String name=sc.next();
         System.out.println("the inter books author");
         String author = sc.next();
		System.out.println("the inter books contactNo");
		int contactNo=sc.nextInt();

    	BooksDTO not = new BooksDTO();
	     not.setId(id);
		 not.setAuthor(author);
		 not.setContactNo(caontactNo);
		 
		 
			air.creatTerminals(not);
			//System.out.println(term.getId()+"    "+term.getName()+"  ");
			//sc.getTerminalsDetalies();
		}
		air.getTerminalsDetalies();
		//System.out.println(term.getId()+"    "+term.getName()+"  ");
	}


	
}