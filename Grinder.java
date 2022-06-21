class Grinder {

static String brand ="Bajaj";
static double price =3000.00d;
static  String colour ="Red";
static boolean isConnected;
static int maxSpeed=7;
static int currentSpeed;
static int minSpeed;

public static void main(String a[]){
	onoroff();
	increaseSpeed();
	increaseSpeed();
	decreaseSpeed();
	decreaseSpeed();
	onoroff();

}
 
    public static void onoroff(){
	
		System.out.println("invoing onoroff()");
		if (isConnected ==false){
			isConnected =  true;
			System.out.println("grinder is turned on...Avalible");
		}
		else if ( isConnected==true){
			isConnected= false;
		System.out.println("grinder is turned off...Avalible");
	}
}
	public static void increaseSpeed(){
	 System.out.println("increaseVolume method strated");
	if( isConnected == true ){
		 System.out.println("Grider is turend onn ");
		 if(currentSpeed < maxSpeed){
		currentSpeed=currentSpeed+1;	 
			 System.out.println("the current Speed is:"+currentSpeed);
 } 
 else{
	System.out.println("maxSpeed reached"); 
 }
 } 
 else{
	System.out.println("Gube..grinder on Madhu"); 
	 
 }
 System.out.println("increaseSpeed method ended"); 
 } 
   public static void decreaseSpeed(){
	 System.out.println("decreaseSpeed method strated");
if( isConnected ==true)	{
	System.out.println("Grinder is turend onn");
	if( currentSpeed > minSpeed){
	currentSpeed = currentSpeed-1;
     System.out.println("the current Speed is:"+currentSpeed);	
		
}
else{
  System.out.println("minSpeed reached");	
}		
} 
else{
	System.out.println("Gube.. grinder on madhu");
}	   
     System.out.println("decreaseSpeed method ended");
}


}












