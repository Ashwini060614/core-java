class  BookMyMovieTester {

  public static void main( String a[]){
 
 String movies[]={"Oh my friend","Orenge","H2O","Upendra","Ratta Kanneeru","Yajamana"};
  String snacks[]={"Samosa","Bhel puri","Vada pava","Bonda"};

  BookMyMovie  bookMymovie = new BookMyMovie("Navarang",343,movies,25,snacks);
  System.out.println( "The name of the teather is"+bookMymovie.teatherName);
	bookMymovie.showTime( 2,"devi","Orenge");
	bookMymovie.buysnacks("Vada pava",34); 
  
  }

}