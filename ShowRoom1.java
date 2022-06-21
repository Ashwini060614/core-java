class ShowRoom{
//instance variables
   int showRoomId;
 // static String name="Woodland";
  //static int noofBranches= 56;
  long contactNo;
  String location;
  
  
  // Farmalerized conatractor
  public ShowRoom( int showRoomId,String loc,long cNo){
  System.out.println("ShowRoom object is created");
 showRoomId=showRoomId;
  location=loc;
  contactNo=cNo;
  }
  // Main method ==== startimg ponit
  public static void main(String a[]){
  //  conatractor are used to init instance variables of a class
        ShowRoom show=new ShowRoom(1,"Vijayanagar",3526327233L);
        // show.showRoomId=1;
		// show.name="Woodland";
		// show.noofBranches=56;
        // show.contactNo=3526327233L;
		// show.location="Vijayanagar";
		 
		System.out.println(show.showRoomId+"  "+show.location+"  "+show.contactNo); 
		//System.out.println(ShowRoom.name+ "       "+ShowRoom.name);
		 
	 ShowRoom show1=new ShowRoom(2,"Basaveshwarnagar",3526327235L);
       // show1.showRoomId=2;
	  	//show1.name="Woodland"; 
		//show1.noofBranches=56;
       // show1.contactNo=3526327235L;
		//show1.location="Basaveshwarnagr";
        System.out.println(show1.showRoomId+"   "+show1.location+"  "+show1.contactNo);
  
  
  
  }






}