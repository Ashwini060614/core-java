class GamesTester{

	public static void main(String a[]){
	GamesDTO ga=new GamesDTO();
	ga.setName("Cricket");
    ga.setRules("aligibity");
	ga.setPrice(5800.00d);
	ga.enjoyment();
	
	System.out.println(ga.getName()+"   "+ga.getRules()+"    "+ga.getPrice()+"   ");
	

	}

}