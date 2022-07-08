import java.util.Scanner; 
 
class HotelTester{
	public static void main(String a []){
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("the inter size of foodItems are add");
		int size = sc.nextInt();
		Hotel tel = new Hotel(size);
		
		for(int i=0; i<size; i++){
		System.out.println("the inter foodItems id");
         int id= sc.nextInt();
		System.out.println("the inter foodItems name");
		String name=sc.next();
         System.out.println("the inter foodItems price");
         double price = sc.nextDouble();
		
    	FoodItemsDTO tem = new FoodItemsDTO();
	     tem.setId(id);
		 tem.setName(name);
		 tem.setPrice(price);
		 
		 
			tel.creatfoodItems(tem);

		}
		     tel.getFoodItemsDetalies();
		//System.out.println(term.getId()+"    "+term.getName()+"  ");
	}


	
}