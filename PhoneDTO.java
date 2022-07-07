class PhoneDTO{
	
	Phone(){
	System.out.println("the phone object is careated");
	
	}
    
	private String brand;
	private int id;
	private String color;
	private double price;
	
	//getter and setter

	public String getBrand(){
	return brand;	
			
	}
	public void setBrand(String brand){
		this.brand=brand;
	}

   public int getId(){
	return id;	
			
	}
	public void setId(int id){
		this.id=id;
	}
   public String getColor(){
	  return color;
  }
	public void setColor(String color){
		
		this.color=color;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	
	//public void watch(){
		
	//	System.out.println("watching movie by using phone");
	//}
	
	
	
	
	
}