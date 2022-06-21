class Transportation{
 int transportId;
 long contactNo;
 String location;


  public Transportation(int id,String loc,long cNo){
  
  System.out.println(" Transportation object is created");
 this.transportId=id;
 this.location=loc;
 this.contactNo=cNo;
  
  }
    public static void main(String a[]){
	
	Transportation transport =new Transportation(1,"Basaveshwarnagr",8123808006L);
	System.out.println(transport.transportId+"  "+transport.location+"  "+transport.contactNo);
	
	Transportation transport1=new Transportation(2,"Vijayanagarnagar",8660646713L);
	 System.out.println(transport1.transportId+"  "+transport1.location+"  "+transport1.contactNo);
	
	Transportation transport2 =new Transportation(3,"MagadiRoad",8123808007L);
	System.out.println(transport2.transportId+"  "+transport2.location+"  "+transport2.contactNo);
	
	Transportation transport3=new Transportation(4,"Jayanagar",8660646712L);
	 System.out.println(transport3.transportId+"  "+transport3.location+"  "+transport3.contactNo);
	
	Transportation transport4=new Transportation(5,"Hanpinagar",8660646711L);
	 System.out.println(transport4.transportId+"  "+transport4.location+"  "+transport4.contactNo);
	
	
	
	
 }
 
 

}

