class AirportTester{

	public static void main(String a[]){
	AirportDTO ar=new AirportDTO();
	ar.setName("Kenpegouda");
    ar.setLocation("Devanhalli");
	ar.setTerminals(21);
	ar.setEmployees(300);
	ar.transportation();
	
	System.out.println(ar.getName()+"   "+ar.getLocation()+"    "+ar.getTerminals()+"   "+ar.getEmployees()+"   ");
	
	
	}






}