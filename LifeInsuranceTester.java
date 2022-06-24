class LifeInsuranceTester{


    public static void main (String a[]){
	
 LIC lic = new LIC();

  lic.duration="15 years";
  lic.price=50000;
  lic.personName="AshwiniSantosh";

  lic.toGetSafety();
 System.out.println(lic.duration+"   "+lic.price+"   "+lic.personName+"   ");
}

}