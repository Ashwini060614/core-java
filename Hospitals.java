
import java.util.Arrays;
 public class Hospitals{

    PatientDTO[] patis;

    public Hospitals(int size){
		patis =new PatientDTO[size];
		System.out.println("Hospitals constuctor is created");
	}

   // Has many Patient
  //  PatientDTO[] patis =new PatientDTO[4];

  //instance variables 
   int index;
  
  public boolean creatPatient(PatientDTO pati){
	  System.out.println("Inside creat patient");
	  boolean isAdded=false;
	  if(pati !=null && pati.getAddress()!=null){
		  this.patis[index++]=pati;	
		 isAdded=true;
       System.out.println("patient detailes created successfully");	   
	  } 
	  else{
		  System.out.println("Cannot add patient... please discharge it");
	  }
    return isAdded;
  }
  
  public void getPatientDetails(){
	  System.out.println("Hospital get the details for patient");
    
	  
for(int i=0;i<patis.length;i++){
	System.out.println(patis[i].getName()+"    "+patis[i].getAddress()+"  "+patis[i].getContactNo()+"    "+patis[i].getId()+"   "+patis[i].getGender() );
} 
	  
  }
  public boolean updatePatientAddressById(int id,String address){
	  System.out.println("creat the updatePatientAddressById");
	  boolean isUpdatedAddress=false;
	  for(int i=0; i<patis.length;i++){
		  if(patis[i].getId()==id){
			  patis[i].setAddress(address);
			  isUpdatedAddress=true;
			   
		  }
		  else{
			  
			  System.out.println("the patient adress is not upadate");
		  }
		 // return isUpdatedAddress;
		  
	  }
	    return isUpdatedAddress;
  }  
  
   public boolean deletPatientDetailsByName(String name){
	   
	   System.out.println("creat the deletPatientDetailsByName() ");
	   boolean isdateContactNo=false;
	   int i,j;
	   for(i=0,j=0; j<patis.length;j++){
		   if(!patis[j].getName().equals(name)){
			   patis[i++]=patis[j];
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
	   
	   patis = Arrays.copyOf(patis,i);
	   
	   
	   // isdateContactNo=true;
	   return isdateContactNo;
	   }
	  
	 
   }
   
  
  
  
  
  


 
 