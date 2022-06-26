class BeerTester{


   public static void main (String a[]){

    KingFisher king =new KingFisher();
   king.quantity ="250ml";
   king.price=645;
   king.alcoholContent="43.92%";
   king.mgfDtae="5 may 2022";
   king.expiry=" best use for 24 months";

  king.toGetEnjoy();
  
  System.out.println(king.quantity+"  "+king.price+"  "+king.alcoholContent+"  "+king.mgfDtae+"   "+king.expiry+"  ");
}

}