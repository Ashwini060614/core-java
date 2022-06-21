class Fan {

static String brand ="Bajaj";
static double price =2500.00d;
static  String colour ="white";
static boolean isConnected;
static int maxSpeed=5;
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
System.out.println("fan is turned on...Avalible");
}
else if ( isConnected==true){
isConnected= false;
System.out.println(" fan is turned off...Avalible");
}
}
	public static void increaseSpeed(){
	 System.out.println("increaspeed method strated");
	if( isConnected == true ){
		 System.out.println("fan is turend onn ");
		 if(currentSpeed < maxSpeed){
		currentSpeed=currentSpeed+1;	 
			 System.out.println("the current Speed is:"+currentSpeed);
 } 
 else{
	System.out.println("maxSpeed reached"); 
 }
 } 
 else{
	System.out.println("Gube.fan on Madhu"); 
	 
 }
 System.out.println("increaseSpeed method ended"); 
 } 
   public static void decreaseSpeed(){
	 System.out.println("decreaseSpeed method strated");
if( isConnected ==true)	{
	System.out.println("ac is turend onn");
	if( currentSpeed > minSpeed){
	currentSpeed = currentSpeed-1;
     System.out.println("the current Speed is:"+currentSpeed);	
		
}
else{
  System.out.println("minSpeed reached");	
}		
} 
else{
	System.out.println("Gube.. fan on madhu");
}	   
     System.out.println("decreaseSpeed method ended");
}


}












