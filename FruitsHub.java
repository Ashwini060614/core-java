class FruitsHub {

static String fruits[] ={"Apple","Kiwi","Charry","orange","Banana"};
  public static void main(String a[]){
  
 String value = getFruits("Apple");
 
 System.out.println("come to shop bring"+value);
 
 }
   public static String getFruits(String Fruit){
  String FruitName =null;
  for(int i=0;i< fruits.length ;i++){
  
  if(fruits[i] == Fruit){  
		  FruitName = fruits[i];
		  
 }
 }
        return FruitName;
  


  }
  
} 
  