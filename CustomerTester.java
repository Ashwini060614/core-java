import java.util.Scanner; 
 
class CustomerTester{
	public static void main(String a []){
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("the inter size of order are add");
		int size = sc.nextInt();
		Customer cus = new Customer(size);
		
		for(int i=0; i<size; i++){
		System.out.println("the inter order id");
         int id= sc.nextInt();
		System.out.println("the inter order name");
		String name=sc.next();
         System.out.println("the inter order price");
         double price = sc.nextDouble();
		 System.out.println("the inter order date");
         String date = sc.next();
		
    	OrderDTO der =new OrderDTO();
	     der.setId(id);
		 der.setName(name);
		 der.setPrice(price);
		 der.setDate(date);
			cus.creatOrder(der);
		}
			
			cus.getOrderDetalies();
			
			System.out.println("The inter updatedName name");
	  String updatedName=sc.next();
       System.out.println("the inter existingId ");
         int existingId= sc.nextInt();
		 cus.updateTerminalsNameById(existingId,updatedName);
		 cus.getOrderDetalies();
		 
		 
       System.out.println("The inter existingName name");
	  String existingName=sc.next();
		 cus.deletTerminalsDetailsByName(existingName);
		 cus.getOrderDetalies();
		 
			
			
		
		}
		     
		//System.out.println(term.getId()+"    "+term.getName()+"  ");
	}


	
