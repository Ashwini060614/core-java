class BikeTester{

  public static void main(String a[]){
  
    Bike bike=new Bike();
  bike.displacement="293cc";
  bike.price=68736;
  bike.maxPower="27.33PS";
  bike.noOfCylinders=1;
 
 bike.Riding();
 
 System.out.println(bike.displacement+"  "+bike.price+"   "+bike.maxPower+"  "+bike.noOfCylinders);

  }
 
 

}