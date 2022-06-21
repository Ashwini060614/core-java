class Cpr  {
   public static void main (String a[]){
   
   int cpr = fact(8)/(fact(8-2)*fact(2));
   System.out.println(cpr);
   
  }
public static int fact(int cpr){
	System.out.println("invoked cpr()");
	System.out.println(" parameter value"+ cpr );
int f=1;
  for(int i=1; i<= cpr; i++){

   f=f*i;

}

 System.out.println("Ended of cpr()");
   
   return f;
} 
} 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
