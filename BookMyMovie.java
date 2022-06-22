 class BookMyMovie{


     String teatherName;
	 String movies[];
     int noOfTickets; 
	 int ticketPrice=600;
	 int totalnoOfTickets;
	 int totalTicketPrice;
	 
	 String snacks[];
	 int snacksPrice=59;
	 int noOfSnacks;
	 int totalSnacksPrice;
	 
	  public BookMyMovie(String teatherName,int totalnoOfTickets,String movies[],int noOfSnacks,String snacks[]){
		 this.teatherName=teatherName;  
		 this.totalnoOfTickets=totalnoOfTickets;
         this.movies=movies;
    	 this.noOfSnacks=noOfSnacks;
         this.snacks=snacks;		 
		  
		System.out.println("BookMyMovie object is created");		
		  
	  }
	  
	public int showTime(int noOfTickets,String bookedBy,String movieName){
	int totalTicketPrice =0;
	
       System.out.println("inside showTime()...");
	   System.out.println("Arg 1;no of Tickets"+noOfTickets);
	   System.out.println("Arg 2;bookedBy"+bookedBy);
	   System.out.println("Arg 3;movieName"+movieName);
	   
	 for(int i=0;i<movies.length;i++){
	 
	 if(movieName == movies[i]){
	  System.out.println("movie name is matched");
	 
	 if(noOfTickets<totalnoOfTickets){
	 
	   totalTicketPrice = noOfTickets*ticketPrice;
		totalnoOfTickets = totalnoOfTickets-noOfTickets;
		System.out.println("for movies ;"+movieName +" No of Tickets are that remaining;"+totalnoOfTickets+" Total Price is "+totalTicketPrice);
	}
	else{
	System.out.println("Ista Tickets Ella ");
     }
	 }
	 else{
	 System.out.println("movie are not available");
	 }
	 }
     return totalTicketPrice;
	 } 
	 
	  public int buysnacks( String snacksName,int quantity){
		int totalSnacksPrice=0;
	   System.out.println("The snackTime method is started");
	   System.out.println("The snacksName"+snacksName);
	   System.out.println("The quantity of the snacks"+quantity);
	   
   for(int i=0;i<snacks.length;i++){
	
	if(snacksName ==snacks[i]){
	System.out.println("snacks name is matched");
	
	if(quantity < noOfSnacks){
		totalSnacksPrice= snacksPrice*quantity;
		noOfSnacks= noOfSnacks-quantity;
		System.out.println("The snacksname;"+snacksName+"The price of the snacks"+totalSnacksPrice+"Total no of snacks available in the shop"+noOfSnacks);	
		
	}	
	else{
		
		System.out.println("The mention snacks are not available please order the other snacks");
	}	
	}	
		
	else{
		System.out.println("snacks are not available");
		
		
	}	
   }	
			
	return totalSnacksPrice;	
 }
 }		
		
		
		
		
		
		
		
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// logic for getting snacksprice.	 
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	   
	   
	
	
	
	
	
	














