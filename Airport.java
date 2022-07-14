
import java.util.Arrays;
 public class Airport{

	TerminalsDTO[] dtos;
	
	public Airport(int size){
		dtos = new TerminalsDTO[size];
		System.out.println("Airport constuctor is created");
	}
   int index;

	public boolean creatTerminals(TerminalsDTO dtos){
		System.out.println("Inside creat terminals");
		boolean isAdded=false;
		if(dtos !=null && dtos.getName() !=null){
			this.dtos[index++]=dtos;
			isAdded=true;
			System.out.println("terminals are created successfully");
		}
		else{
			System.out.println("can  dont add terminals...");
		}
		return isAdded;
	
	}
	public void getTerminalsDetalies(){
		System.out.println("Airport get the terminals detalies");
		
		for(int i=0;i<dtos.length ;i++){
			System.out.println(dtos[i].getId()+"  "+dtos[i].getName()+"   ");
		}
	}
	
	 public boolean updateTerminalsNameById(int id,String name){
	  System.out.println("creat the updateTerminalsNameById()");
	  boolean isUpdatedName=false;
	  for(int i=0; i<dtos.length;i++){
		  if(dtos[i].getId()==id){
			  dtos[i].setName(name);
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
	   for(i=0,j=0; j<dtos.length;j++){
		   if(!dtos[j].getName().equals(name)){
			   dtos[i++]=dtos[j];
		// if(patis[i].getName()==name){
			// patis[i].setContactNo(contactNo);
		//patis[i]=null;}
			 isdateContactNo=true;
		   }	// System.out.println("the patient contactNo is delet");
		//patis=Arrarys.copyof(patis,i);
	   
	   else{
		        System.out.println("");
	       }
	   }
	   
	   dtos = Arrays.copyOf(dtos,i);
	   
	   
	   // isdateContactNo=true;
	   return isdateContactNo;
	   }
 }
 