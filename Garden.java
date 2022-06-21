class Garden{

 int gardenId;
 long contactNo;
 String location;


  public Garden(int id,String loc,long cNo){
  
  System.out.println(" Garden object is created");
  this.gardenId=id;
  this.location=loc;
  this.contactNo=cNo;
  
  }
    public static void main(String a[]){
	
	Garden garden =new Garden(1,"Basaveshwarnagr",8123808006L);
	System.out.println(garden.gardenId+"  "+garden.location+"  "+garden.contactNo);
	
	Garden garden1=new Garden(2,"Vijayanagarnagar",8660646713L);
	 System.out.println(garden1.gardenId+"  "+garden1.location+"  "+garden1.contactNo);
	
	Garden garden2 =new Garden(3,"MagadiRoad",8123808007L);
	System.out.println(garden2.gardenId+"  "+garden2.location+"  "+garden2.contactNo);
	
	Garden garden3=new Garden(4,"Jayanagar",8660646712L);
	 System.out.println(garden3.gardenId+"  "+garden3.location+"  "+garden3.contactNo);
	
	Garden garden4=new Garden(5,"Hanpinagar",8660646711L);
	 System.out.println(garden4.gardenId+"  "+garden4.location+"  "+garden4.contactNo);
	
	
	
	
 }
 
 

}

