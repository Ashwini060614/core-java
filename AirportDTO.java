public class AirportDTO{
	
	
	private String name;
	private String location;
	private int terminals;
	private int employees;

	public AirportDTO(){
		System.out.println("airport object is careted");
	}
	
	//getter and setter
	public  String getName(){
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
	public int getTerminals(){
		return terminals;
	}
	public void setTerminals(int terminals){
		
		this.terminals=terminals;
	}
	public int getEmployees(){
		return employees;
	}
	public void setEmployees(int employees){
		
		this.employees=employees;
	}

  
	public void transportation(){
		
		System.out.println("the transport the goods");
	}
}