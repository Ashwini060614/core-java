
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
	System.out.println(patis[i]);
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
  

	public String getPatientNameById(int id){
		String patientName=null;
		System.out.println("getPatientNameById() invoked");
		
		for(int i=0;i<patis.length;i++){
			if(patis[i].getId()==id ){
				patientName = patis[i].getName();
				System.out.println("patientName");
			
			}
			else {
				System.out.println("Entered Id doesnot Exists");
			}
		}		
		return patientName;
	}
	
	public PatientDTO getpatientDetailsById(int id){
		PatientDTO patientDetails = null;
		System.out.println("getPatientDetails() invoked");
		for(int i=0;i<patis.length;i++){
			if(patis[i].getId()==id ){
				patientDetails = patis[i];
				System.out.println(patientDetails);
			}
			else {
				System.out.println("Entered Id does not exists");
			}
		}
		
		return patientDetails;
	}
	
	public boolean deletedPatientById(int id){
		boolean deletedPatient = false;
		System.out.println("deletedPatientById () created");
		int i,j;
		for(i=0,j=0;j<patis.length;j++){
			if(patis[j].getId() !=id ){
				patis[i++]=patis[j];
				System.out.println("patient deleted successfully");
				deletedPatient = true;
			}
			else {
				System.out.println("Entered id does not exists");
			}
		}
		patis = Arrays.copyOf(patis,i);
		return deletedPatient;		
		
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
   
  
  
  
  
  


 
 