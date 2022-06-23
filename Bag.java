class Bag{
  
  String name;
  int price;
  
  public Bag(){
  this.Carry();
  System.out.println("Bag object is created");
  
  }

  public Bag(String name,int price){
  this.name= name;
  this.price=price;
  
 
  }
  
  public static  void main(String a[]){
  Bag bag=new Bag("Safari",1300);
  System.out.println(bag.name+"  "+bag.price);
  
  }
  
  public static void Carry(){
  System.out.println("bag carry the book ");
  
  }
  
  
}