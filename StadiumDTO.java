 public class StadiumDTO {

   StadiumDTO(){
	System.out.println("the Stadium object is careated");
	
	}
    
	private String name;
	private int id;
	private String location;
	private long contactNo;
	
	//getter and setter

	public String getName(){
	return name;	
			
	}
	public void setName(String name){
		this.name=name;
	}

   public int getId(){
	return id;	
			
	}
	public void setId(int id){
		this.id=id;
	}
   public String getLocation(){
	  return location;
  }
	public void setLocation(String location){
		
		this.location=location;
	}
	
	public double getContactNo(){
		return contactNo;
	}
	public void setPrice(long contactNo){
		this.contactNo=contactNo;
	}
	
	
	public void playing(){
		
		System.out.println("The playing cricket in stadium");
	}
	
	
	
	
	
}


