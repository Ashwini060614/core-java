class PhoneTester{

	public static void main(String a[]){
	PhoneDTO one=new PhoneDTO();
	one.setBrand("aksha");
	one.setId(2);
	one.setColor("pink");
	one.setPrice(25000.00d);
	one.watch();
	
	System.out.println(one.getBrand()+"   "+one.getId()+"  "+one.getColor()+"  "+one.getPrice()+"  ");
	}

}