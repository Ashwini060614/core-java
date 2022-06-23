class Clothes{
      String name;
	  int price;
	  
	  
 public Clothes(){
	this.providFashion();
	 System.out.println("Clothes object is created"); 
	 
 }

 public Clothes(String name,int price){
	 
  // this();
    this.name=name;
	this.price=price;
	 
 }
  public static void main (String a[]){
	  
    Clothes clothes= new Clothes("fant",560);
	
	System.out.println(clothes.name+"  "+clothes.price+" ");
	
	
   
  }
  
	
	
    public static void providFashion(){
		
	System.out.println(" to proved  the Fashion");
	 	
		
	}
   
   
   }













