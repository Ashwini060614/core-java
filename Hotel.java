
import java.util.Arrays;
 public class Hotel{

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
			System.out.println(food[i].getId()+"  "+food[i].getName()+"   "+food[i].getPrice()+"    "+food[i].getContactNo());
		}
	}
	 public boolean updateFoodItemContactNoById(int id,long contactNo){
	   System.out.println("creat the updatefooditemContactNoByName");
	   boolean isUpdateContactNo=false;
	   for(int i=0;i<food.length;i++){
		 if(food[i].getId()==id){
			 food[i].setContactNo(contactNo);
			 isUpdateContactNo=true;
		 } 
			else{
				
				System.out.println(" foofItems contactNo is not update");
			} 
			 
		 }  
		  return isUpdateContactNo; 
		    
	   }
	   
	  public boolean deletTerminalesDetailsByName(String name){
	   System.out.println("creat the deletTerminalsDetailsByName() ");
	   boolean isdateContactNo=false;
	   int i,j;
	   for(i=0,j=0; j<food.length;j++){
		   if(!food[j].getName().equals(name)){
			   food[i++]=food[j];
			 isdateContactNo=true;
		   }	// System.out.println("the patient contactNo is delet");
		//patis=Arrarys.copyof(patis,i);
	   
	   else{
		   System.out.println("");
	   }
	   }
	   food=Arrays.copyOf(food,i);
	   return isdateContactNo ;
	  }
}
