import java.util.Arrays;
public class Customer{

	OrderDTO[] der;
	
	public Customer(int size){
		der = new OrderDTO[size];
		System.out.println("customer constuctor is created");
	}
   int index;

	public boolean creatOrder(OrderDTO xyz){
		System.out.println("Inside creat order");
		boolean isAdded=false;
		if(xyz!=null && xyz.getName() !=null){
			der[index++]=xyz;
			isAdded=true;
			System.out.println("order are created successfully");
		}
		else{
			System.out.println("can  dont add order...");
		}
		return isAdded;
	
	}
	public void getOrderDetalies(){
		System.out.println("hotel get the order detalies");
		
		for(int i=0;i<der.length ;i++){
			System.out.println(der[i].getId()+"  "+der[i].getName()+"   "+der[i].getPrice()+"    "+der[i].getDate()+"    ");
		}
	}
	public boolean updateTerminalsNameById(int id,String name){
	  System.out.println("creat the updateTerminalsNameById()");
	  boolean isUpdatedName=false;
	  for(int i=0; i<der.length;i++){
		  if(der[i].getId()==id){
			  der[i].setName(name);
			  isUpdatedName=true;
			   
		  }
		  else{
			  
			  System.out.println("the terminals name is not upadate");
		  }
		 // return isUpdatedAddress;
		  
	  }
	    return isUpdatedName;
  }  
  
   public boolean deletTerminalsDetailsByName(String name){
	   
	   System.out.println("creat the deletterminals DetailsByName() ");
	   boolean isdateContactNo=false;
	   int i,j;
	   for(i=0,j=0; j<der.length;j++){
		   if(!der[j].getName().equals(name)){
			   der[i++]=der[j];
		
			 isdateContactNo=true;
		   }	
	   
	   else{
		        System.out.println("");
	       }
	   }
	   
	   der = Arrays.copyOf(der,i);
	   
	   
	   // isdateContactNo=true;
	   return isdateContactNo;
	   }
}