class LaptopTester{

  public static void main(String a[]){
  
   Acer acer = new Acer();
   
   acer.modleType="Vostro";
   acer.price=30000;
   acer.operatingSystem="Windows11home";
  
  acer.playGame();
  
  System.out.println(acer.modleType+"    "+acer.price+"    "+acer.operatingSystem+"   ");
  }

}