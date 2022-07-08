class Hotel{

	FoodItemsDTO[] food;
	
	public Hotel(int size){
		food = new FoodItemsDTO[size];
		System.out.println("hotel constuctor is created");
	}
   int index;

	public boolean creatfoodItems(FoodItemsDTO tem){
		System.out.println("Inside creat foofItems");
		boolean isAdded=false;
		if(tem!=null && tem.getName() !=null){
			this.food[index++]=tem;
			isAdded=true;
			System.out.println("foofItems are created successfully");
		}
		else{
			System.out.println("can  dont add foofItems...");
		}
		return isAdded;
	
	}
	public void getFoodItemsDetalies(){
		System.out.println("hotel get the foofItems detalies");
		
		for(int i=0;i<food.length ;i++){
			System.out.println(food[i].getId()+"  "+food[i].getName()+"   "+food[i].getPrice()+"    ");
		}
	}
}