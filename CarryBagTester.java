 class CarryBagTester{

	public static void main(String a[]){
	
	CarryBagDTO carry = new CarryBagDTO();
	// carry.name="kavi";
	// carry.price=6.00;
	carry.setName("kavi's carrybag");
	carry.setPrice(6);
	carry.purpose();
	
	System.out.println(carry.getName()+"  "+carry.getPrice()+"  ");
	
	}




}