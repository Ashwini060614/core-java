class Fruits{
      String name;
	  int price;
	  
	  
 public Fruits(){
	this.providNutrition();
	 System.out.println("Fruits object is created"); 
	 
 }

 public Fruits(String name,int price){
	 //Fruits fruits =new Fruits?("Kivi",100);
  // this();
    this.name=name;
	this.price=price;
	 
 }
  public static void main (String a[]){
	  //this.providNutrition();
    Fruits fruits= new Fruits("Mango",354);
	
	System.out.println(fruits.name+"  "+fruits.price+" ");
	//this.providNutrition();
	
   
  }
  // public Fruits(String name,int price){
	 //Fruits fruits =new Fruits?("Kivi",100);
	// this();
   // this.name=name;
	//this.price=price;
    public static void providNutrition(){
		
	System.out.println(" to proved the nutritation");
	 	
		
	}
   
   
   }













