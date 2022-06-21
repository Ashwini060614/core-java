class Theater{

 String name;													
 String address;
 long contactNo;
 String ownerName;


public static void main (String a[]){
//className refvariables=new className();
    Theater theater=new Theater();
    theater.name="Veeresh";
    theater.address="Rajajinagar";
	theater.contactNo=8123808006L;
	theater.ownerName="Ashwini";
    theater.runningMovies[0]="Viram";
    theater.runningMovies[1]="Charlie";
    theater.runningMovies[2]="KGF2";
	System.out.println("1st Theater objrct detalis"); 
	//theater.getRunningMovies();
	
	      System.out.println("The Theater name" +theater.name);
	  	  System.out.println("The Theater address" +theater.address);
	      System.out.println("The Theater contact No" +theater.contactNo);
          System.out.println("The Theater owner Name" +theater.ownerName);
		  System.out.println("in"+ theater.name+"RunningMovies are");
		  theater.getRunningMovies();
		  
	Theater theater1=new Theater();	  
	theater1.name ="Urvashi";
    theater1.address="Shvajinagar";
	theater1.contactNo=8123808006L;
	theater1.ownerName="Asha";
    theater1.runningMovies[0]="Om";
    theater1.runningMovies[1]="KGF";
    theater1.runningMovies[2]="Vikram";
    System.out.println("2nd Theater1 objrct detalis ");
	// theater1.getRunningMovies();
		  
		  System.out.println("The Theater1 name is"+theater1.name);
	  	  System.out.println("The Theater1 address is"+theater1.address);
	      System.out.println("The Theater1 contact No is"+theater1.contactNo);
          System.out.println("The Theater1 owner Name is"+theater1.ownerName);
		  System.out.println("in"+theater1.name+"RunningMovies are");
		  theater1.getRunningMovies();	
		  
  }	  
      public void getRunningMovies(){
	  for (int z=0; z<runningMovies.length; z++){
				
			System.out.println(runningMovies[z]);
				
		
				
	}				
				
   }			
				
   }				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
				
			
			
		
   
		   
	   
	   
	   
   



