class ChocolatesHub {

static String chocolates[] ={"Kitkat","Peak","Bournville","DairyMilk","5Star"};
  public static void main(String a[]){
  
 String value = getChocolates("Kitkat");
 
 System.out.println("come to shop bring"+value);

 }
   public static String getChocolates(String chocolate){
  String ChocolateName = null;
  for(int i=0;i< chocolates.length ;i++){
  
  if(chocolates[i] == chocolate){  
		  ChocolateName = chocolates[i];
		  
 }
 }
        return ChocolateName;
  


  }
  
} 
  