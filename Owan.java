class Owan {

static String brand ="Philips";
static double price =5000.00d;
static  String colour ="Black";
static boolean isConnected;
static int maxSpeed=6;
static int currentSpeed;
static int minSpeed;

public static void main(String a []){
onoroff();
increaseSpeed();
increaseSpeed();
increaseSpeed();
increaseSpeed();
onoroff();

}
 
public static void onoroff(){
	System.out.println("invoking onoroff()");
	if(isConnected ==false){
		isConnected = true;
		System.out.println("owan is turned on...Avalible");
	}
	else if(isConnected ==true){
		isConnected =false;
		System.out.println("owan is turend off....Avalible");
	}
}
    public static void increaseSpeed(){
	   System.out.println("increaseSpeed method strated");
     if( isConnected ==true){
		System.out.println("owan is turend onn");
       if(currentSpeed < maxSpeed){
		  currentSpeed = currentSpeed+1;
		 System.out.println("the current Speed is:"+currentSpeed);
   }
	else{
		System.out.println("maxSpeed reached");
}	 
}	   
    else{
			 System.out.println("increaseSpeed method ended");
	}
	System.out.println("Gube..owan on madhu");

}
	 
}	 
 	 
	 
	 
	 
	 
	 
	











	
	

 