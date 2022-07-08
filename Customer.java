class Customer{

	OrderDTO[] der;
	
	public Customer(int size){
		der = new OrderDTO[size];
		System.out.println("customer constuctor is created");
	}
   int index;

	public boolean creatOrder(OrderDTO xyz){
		System.out.println("Inside creat order");
		boolean isAdded=false;
		if(xyz!=null && xyz.getName() !=null){
			der[index++]=xyz;
			isAdded=true;
			System.out.println("order are created successfully");
		}
		else{
			System.out.println("can  dont add order...");
		}
		return isAdded;
	
	}
	public void getOrderDetalies(){
		System.out.println("hotel get the order detalies");
		
		for(int i=0;i<der.length ;i++){
			System.out.println(der[i].getId()+"  "+der[i].getName()+"   "+der[i].getPrice()+"    "+der[i].getDate()+"    ");
		}
	}
}