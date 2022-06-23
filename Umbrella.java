class Umbrella {
      String name;
	  int price;
	  
	  
 public Umbrella(){
	this.providSafety();
	 System.out.println("Umbrella object is created"); 
	 
 }

 public Umbrella(String name,int price){
	 
  
    this.name=name;
	this.price=price;
	 
 }
  public static void main (String a[]){
	  
    Umbrella umbrella = new Umbrella("Badam",560);
	
	System.out.println(umbrella.name+"  "+umbrella.price+" ");
  }
  
    public static void providSafety(){
		
	System.out.println(" to proved safety for the health");
	 	
		
	}
   
   
   }













