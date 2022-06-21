class Speaker {

static String brand ="Bajaj";
static double price =2500.00d;
static  String colour ="white";
static boolean isConnected;
static int maxVolume=5;
static int currentVolume;
static int minVolume;


public static void main(String a []){
onoroff();
increaseVolume();
increaseVolume();
decreaseVolume();
decreaseVolume();
onoroff();

}
 
    public static void onoroff(){
	
System.out.println("invoing onoroff()");
if (  isConnected ==false){
isConnected =  true;
System.out.println("speaker is turned on...Avalible");
}
else if ( isConnected==true){
isConnected= false;
System.out.println(" speaker is turned off...Avalible");
}
}
	public static void increaseVolume(){
	 System.out.println("increaspeed method strated");
	if( isConnected == true ){
		 System.out.println("speakeris turend onn ");
		 if(currentVolume < maxVolume){
		currentVolume=currentVolume+1;	 
			 System.out.println("the current Volume is:"+currentVolume);
 } 
 else{
	System.out.println("maxVolume reached"); 
 }
 } 
 else{
	System.out.println("Gube.speaker on Madhu"); 
	 
 }
 System.out.println("increaseVolume method ended"); 
 } 
   public static void decreaseVolume(){
	 System.out.println("decreaseVolume method strated");
if( isConnected ==true)	{
	System.out.println("speaker is turend onn");
	if( currentVolume > minVolume){
	currentVolume = currentVolume-1;
     System.out.println("the current Volume is:"+currentVolume);	
		
}
else{
  System.out.println("minVolumereached");	
}		
} 
else{
	System.out.println("Gube.. speaker on madhu");
}	   
     System.out.println("decreaseVolume method ended");
}


}










