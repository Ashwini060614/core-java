class Hospitals{


    public Hospitals(){
		System.out.println("Hospitals constuctor is created");
	}

   // Has many Patient
    PatientDTO[] patis =new PatientDTO[1];

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
	System.out.println(patis[i].getName()+"    "+patis[i].getAddress()+"  "+patis[i].getGender()+"  "+patis[i].getContactNo());
} 
	  
  }
  
}