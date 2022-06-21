class VegetablesHub {

static String vegetables[] ={ "Potato","Tomato","Brinjal","Radish","Onion"};
  public static void main(String a[]){q
  
 String value = getVegetables("Brinjal");
 
 System.out.println("come to shop bring"+value);
 
 }
   public static String getVegetables(String vegetable){
  String vegetableName =null;
  for(int i=0;i< vegetables.length ;i++){ 
  
  if(vegetables[i] == vegetable){
		  vegetableName = vegetables[i];
		  
		  }
 else{
	 
	System.out.println( vegetables+ "is not persent in list":); 
 }
 }
        return vegetableName;
  


  }
  
} 
  