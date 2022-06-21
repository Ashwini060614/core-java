class Npr {
   public static void main (String a[]){
   
   int npr = fact(5)/fact(5-2);
   System.out.println(npr);
   
  }
public static int fact(int npr){
	System.out.println("invoked npr()");
	System.out.println(" parameter value"+ npr );
int f=1;
  for(int i=1; i<= npr; i++){

   f=f*i;

}

 System.out.println("Ended of npr()");
   
   return f;
} 
} 
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
