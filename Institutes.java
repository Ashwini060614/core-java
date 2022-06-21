class Institutes{

 int institutesId;
 long contactNo;
 String location;


  public Institutes(int id,String loc,long cNo){
  
  System.out.println(" Institutes object is created");
  this.institutesId=id;
  this.location=loc;
  this.contactNo=cNo;
  
  }
    public static void main(String a[]){
	
	Institutes institutes =new Institutes(1,"Basaveshwarnagr",8123808006L);
	System.out.println(institutes.institutesId+"  "+institutes.location+"  "+institutes.contactNo);
	
	Institutes institutes1=new Institutes(2,"Vijayanagarnagar",8660646713L);
	 System.out.println(institutes1.institutesId+"  "+institutes1.location+"  "+institutes1.contactNo);
	
	Institutes institutes2 =new Institutes(3,"MagadiRoad",8123808007L);
	System.out.println(institutes2.institutesId+"  "+institutes2.location+"  "+institutes2.contactNo);
	
	Institutes institutes3=new Institutes(4,"Jayanagar",8660646712L);
	 System.out.println(institutes3.institutesId+"  "+institutes3.location+"  "+institutes3.contactNo);
	
	Institutes institutes4=new Institutes(5,"Hanpinagar",8660646711L);
	 System.out.println(institutes4.institutesId+"  "+institutes4.location+"  "+institutes4.contactNo);
	
	
	
	
 }
 
 

}

