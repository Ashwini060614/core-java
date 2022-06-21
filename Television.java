class Television {

static String brand ="Redmi";
static double price =30000.00d;
static  String colour ="Black";
static boolean isConnected;
static int maxVolume=6;
static int currentVolume;
static int minVolume;


public static void main(String a[]){
	onoroff();
	increaseVolume();
	increaseVolume();
	decreaseVolume();
	decreaseVolume();
	onoroff();

}
 
    public static void onoroff(){
	
		System.out.println("invoing onoroff()");
		if (isConnected ==false){
			isConnected =  true;
			System.out.println("television is turned on...Avalible");
		}
		else if ( isConnected==true){
			isConnected= false;
		System.out.println("television is turned off...Avalible");
	}
}
	public static void increaseVolume(){
	 System.out.println("increaseVolume method strated");
	if( isConnected == true ){
		 System.out.println("Television is turend onn ");
		 if(currentVolume < maxVolume){
		currentVolume=currentVolume+1;	 
			 System.out.println("the current Volume is:"+currentVolume);
 } 
 else{
	System.out.println("maxVolume reached"); 
 }
 } 
 else{
	System.out.println("Gube..television on Madhu"); 
	 
 }
 System.out.println("increaseVolume method ended"); 
 } 
   public static void decreaseVolume(){
	 System.out.println("decreaseVolume method strated");
if( isConnected ==true)	{
	System.out.println("Grinder is turend onn");
	if( currentVolume > minVolume){
	currentVolume = currentVolume-1;
     System.out.println("the current Volume is:"+currentVolume);	
		
}
else{
  System.out.println("minVolume reached");	
}		
} 
else{
	System.out.println("Gube.. television on madhu");
}	   
     System.out.println("decreaseVolume method ended");
}


}












