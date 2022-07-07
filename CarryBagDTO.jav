class CarryBagDTO{

	public CarryBag(){
		
	System.out.println("CarryBag object is creatde");
	
}
	//to achives Encapsulation
	private String name;
	private double price;
	
	//getter and setter
	public String getName(){
		return name;	
	}
	public void setName(String name){
		this.name=name;
		
	}
	
	public double getPrice(){
		
		return price;
	}
	
	public void setPrice(double price){
		
		this.price=price;
	}
 
	//public void purpose(){
		
	//System.out.println("carry bag purpose to carry materials");	
	//}

}