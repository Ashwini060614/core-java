class WashingMechine {

static String brand ="LG";
static double price =25000.00d;
static  String colour ="White";
static boolean isConnected;
static int maxSpeed=8;
static int currentSpeed;
static int minSpeed;


public static void main(String a []){
onoroff();
increaseSpeed();
increaseSpeed();
decreaseSpeed();
decreaseSpeed();
onoroff();

}
 
    public static void onoroff(){
	
System.out.println("invoing onoroff()");
if (  isConnected ==false){
isConnected =  true;
System.out.println("washingmechine is turned on...Avalible");
}
else if ( isConnected==true){
isConnected= false;
System.out.println("washingmechine is turned off...Avalible");
}
}

	public static void increaseSpeed(){
	 System.out.println("increaseVolume method strated");
	if( isConnected == true ){
		 System.out.println("washingmechine is turend onn ");
		 if(currentSpeed < maxSpeed){
		currentSpeed=currentSpeed+1;	 
			 System.out.println("the current Speed is:"+currentSpeed);
 } 
 else{
	System.out.println("maxSpeed reached"); 
 }
 } 
 else{
	System.out.println("Gube..washingmechine on Madhu"); 
	 
 }
 System.out.println("increaseSpeed method ended"); 
 } 
   public static void decreaseSpeed(){
	 System.out.println("decreaseSpeed method strated");
if( isConnected ==true)	{
	System.out.println("washingmechine is turend onn");
	if( currentSpeed > minSpeed){
	currentSpeed = currentSpeed-1;
     System.out.println("the current Speed is:"+currentSpeed);	
		
}
else{
  System.out.println("minSpeed reached");	
}		
} 
else{
	System.out.println("Gube.. washingmechine on madhu");
}	   
     System.out.println("decreaseSpeed method ended");
}


}












