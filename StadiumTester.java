class StadiumTester{

	public static void main(String a[]){
	 StadiumDTO sta =new StadiumDTO();
	 sta.setName("Kantirava");
	 sta.setId(1245);
	 sta.setLocation("Bengaluru");
	 sta.setContactNo(1234567890L);
	 sta.playing();
	 
	 System.out.println(sta.getName()+"    "+sta.getId()+"   "+sta.getLocation()+"   "+sta.getContactNo()+"    ");
	
	}
}