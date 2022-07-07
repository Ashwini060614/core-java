public class GamesDTO{

	private String name;
	private String rules;
	private double price;
	
	GamesDTO(){
		System.out.println("game object is created");
	}
	
	//getter nd setter
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		
		this.name=name;
	}
	public String getRules(){
		return rules;
	}
	public void setRules(String rules){
		
		this.rules=rules;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
	
      this.price=price;
	}
	  public void enjoyment(){
	  System.out.println("The games very important");
	  
	  }
}