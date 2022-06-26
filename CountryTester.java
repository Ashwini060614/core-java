class CountryTester{

    public static void main(String a[]){
	 India ind=new India();
	
	ind.area="3.287million km2";
   ind.states=31;
   ind.carency="Rupees";
   ind.emblem="Lion Capital of Ashoke";
   ind.population=1406828726L;
	  
	  
	 ind.toGetCountryDetails();
	
   System.out.println(ind.area+"  "+ind.states+"   "+ind.carency+"   "+ind.emblem+"   "+ind.population+"   ");
	}


}