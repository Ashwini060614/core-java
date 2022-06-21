class PetrolBunk{

 int petrolId;
 long contactNo;
 String location;


  public PetrolBunk(int id,String loc,long cNo){
  
  System.out.println(" PetrolBunk object is created");
 petrolId= this.id;
 location=this.loc;
 contactNo=this.cNo;
  
  } 
    public static void main(String a[]){
	
	PetrolBunk petrol =new PetrolBunk(1,"Basaveshwarnagr",8123808006L);
	System.out.println(petrol.petrolId+"  "+petrol.location+"  "+petrol.contactNo);
	
	PetrolBunk petrol1=new PetrolBunk(2,"Vijayanagarnagar",8660646713L);
	 System.out.println(petrol.petrolId+"  "+petrol1.location+"  "+petrol1.contactNo);
	
	PetrolBunk petrol2 =new PetrolBunk(3,"MagadiRoad",8123808007L);
	System.out.println(petrol2.petrolId+"  "+petrol2.location+"  "+petrol2.contactNo);
	
	PetrolBunk petrol3=new PetrolBunk(4,"Jayanagar",8660646712L);
	 System.out.println(petrol3.petrolId+"  "+petrol3.location+"  "+petrol3.contactNo);
	
	PetrolBunk petrol4=new PetrolBunk(5,"Hanpinagar",8660646711L);
	 System.out.println(petrol4.petrolId+"  "+petrol4.location+"  "+petrol4.contactNo);
	
	
	
	
 }
 
 

}

