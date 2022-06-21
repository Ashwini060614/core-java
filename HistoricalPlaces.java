
class HistoricalPlaces {

 int historicalId;
 long contactNo;
 String location;


  public HistoricalPlaces (int id,String loc,long cNo){
  
  System.out.println(" HistoricalPlaces object is created");
 this.historicalId=id;
 this.location=loc;
  this.contactNo=cNo;
  
  }
    public static void main(String a[]){
	
	HistoricalPlaces historical =new HistoricalPlaces(1,"Basaveshwarnagr",8123808006L);
	System.out.println(historical.historicalId+"  "+historical.location+"  "+historical.contactNo);
	
	HistoricalPlaces historical1=new HistoricalPlaces(2,"Vijayanagarnagar",8660646713L);
	 System.out.println(historical1.historicalId+"  "+historical1.location+"  "+historical1.contactNo);
	
	HistoricalPlaces historical2 =new HistoricalPlaces(3,"MagadiRoad",8123808007L);
	System.out.println(historical2.historicalId+"  "+historical2.location+"  "+historical2.contactNo);
	
	HistoricalPlaces historical3=new HistoricalPlaces(4,"Jayanagar",8660646712L);
	 System.out.println(historical3.historicalId+"  "+historical3.location+"  "+historical3.contactNo);
	
	HistoricalPlaces historical4=new HistoricalPlaces(5,"Hanpinagar",8660646711L);
	 System.out.println(historical4.historicalId+"  "+historical4.location+"  "+historical4.contactNo);
	
	
	
	
 }
 
 

}

