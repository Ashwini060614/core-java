class DryFruits{
      String name;
	  int price;
	  
	  
 public DryFruits(){
	this.providEnergy();
	 System.out.println("DryFruits object is created"); 
	 
 }

 public DryFruits(String name,int price){
	 
  
    this.name=name;
	this.price=price;
	 
 }
  public static void main (String a[]){
	  
    DryFruits dryFruits= new DryFruits("Badam",560);
	
	System.out.println(dryFruits.name+"  "+dryFruits.price+" ");
  }
  
    public static void providEnergy(){
		
	System.out.println(" to proved Energy for the health");
	 	
		
	}
   
   
   }













