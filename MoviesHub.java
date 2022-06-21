class MoviesHub {

static String movies[] ={ "Charlie 777","Viram","Mansika","KGF2"};
  public static void main(String a[]){
  
 String value = getMovies("KGF2 ");
 
 System.out.println("come...willl.wach"+value);
 
 }
 
   public static String getMovies(String movie){
  String movieName =null;
  for(int i=0;i< movies.length ;i++){
  
  if(movies[i] == movie){
		  movieName =movies[i];
		  
 }
 }
        return movieName;
  


  }
  
} 
  