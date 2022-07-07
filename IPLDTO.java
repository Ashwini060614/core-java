 public class IPLDTO{

	private String name;
	private String location;
	private String date;
	
	public  IPLDTO(){
		System.out.println("IPL object is created");
	}
	//getter nd setter                           
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		
		this.name=name;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String location){
		
		this.location=location;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
	
      this.date=date;
	}
	  public void enjoyment(){
	  System.out.println("The IPL very important");
	  
	  }
}