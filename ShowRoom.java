class ShowRooom{
//instance variables
   int showRooomId;
 // static String name="Woodland";
  //static int noofBranches= 56;
  long contactNo;
  String location;
  
  
  // Farmalerized conatractor
  public ShowRoom( int showRooomId,String loc,long cNo){
  System.out.println("ShowRoom object is created");
 showRooomId=showRooomId;
  location=loc;
  contactNo=cNo;
  }
  // Main method ==== startimg poni
  public static void main(String a[]){
  //  conatractor are used to init instance variables of a class
        ShowRooom show=new ShowRooom(1,"Vijayanagar",3526327233L);
        // show.showRoomId=1;
		// show.name="Woodland";
		// show.noofBranches=56;
        // show.contactNo=3526327233L;
		// show.location="Vijayanagar";
		 
		System.out.println(show.showRooomId+"  "+show.location+"  "+show.contactNo); 
		//System.out.println(ShowRoom.name+ "       "+ShowRoom.name);
		 
	 ShowRooom show1=new ShowRooom(2,"Basaveshwarnagar",3526327235L);
       // show1.showRoomId=2;
	  	//show1.name="Woodland"; 
		//show1.noofBranches=56;
       // show1.contactNo=3526327235L;
		//show1.location="Basaveshwarnagr";
        System.out.println(show1.showRooomId+"   "+show1.location+"  "+show1.contactNo);
  
  
  
  }






}