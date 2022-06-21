class CoolDrinksHub{

static String coolDrinks[]={"Sprite","ThumsUp","Fanta","maaza","Mirinda"};
    public static void main(String a[]){
	
	String value =getCoolDrinks("Fanta");
	
	System.out.println("welcome to shop bring it" +value);
	

}
     public static String getCoolDrinks(String cooldrink){
	 String CoolDrinkName =null;
	 
	 for(int i=0;i<coolDrinks.length ;i++){
	 
	 if(coolDrinks[i] == coolDrink ){
	 
	 CoolDrinkName = coolDrinks[i];

 }

 }
	return CoolDrinkName;
	 
 }

}