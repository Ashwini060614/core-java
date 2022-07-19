 
 import java.util.Scanner;
 class HospitalsTester{

  public static void main(String a[]){
	  Scanner sc =new Scanner(System.in);
	   System.out.println("The inter size of the patient are add");
	  int size=sc.nextInt();
      Hospitals hos =new Hospitals(size);
	  
	  for(int i=0; i < size ;i++)
	  {
	  //Scanner sc =new Scanner(System.in);
	  // System.out.println("The inter size of the patient are add");
	 // int size=sc.nextInt();
	  System.out.println("The inter patient name");
	  String name=sc.next();
	  System.out.println("The inter patient address");
	  String address =sc.next();
	  System.out.println("The inter patient contactNo");
	  long contactNo =sc.nextLong();
	   System.out.println("The inter patient id");
	  int id=sc.nextInt();
	   System.out.println("The inter patient gender");
	  String gender=sc.next();
	 
	 // Hospitals hos =new Hospitals(size);
    PatientDTO pati =new PatientDTO();
	  pati.setGender(Gender.valueOf(gender));
       pati.setName(name);
	   pati.setAddress(address);
       pati.setContactNo(contactNo);
	   pati.setId(id);
        hos.creatPatient(pati);
	
	  }
	  
	  String option = null;
		
		do {
			System.out.println("Enter 1 to Fetch All Patients");
			System.out.println("Enter 2 to update patient Address by patient Id");
			System.out.println("Enter 3 to getpatientDetailsById");
			System.out.println("Enter 4 to get deletedPatientById");
			System.out.println("Enter 5 to delete patient by Name");
			System.out.print("Enter Choice :");
			
			int choice = sc.nextInt();
			switch(choice){
				case 1 :	hos. getPatientDetails();
							break;
				
				case 2 :	System.out.print("Enter existing Id : ");
							int existingId = sc.nextInt();
							System.out.print("Enter updated Price : ");
							String updatedAddress = sc.next();
							hos. updatePatientAddressById(existingId, updatedAddress);
							break;
				case 3:	System.out.print("Enter existing Id :");
							int existsId = sc.nextInt();
							hos.getPatientNameById(existsId);
							break;
							
				case 4 :	System.out.print("Enter existing Id :");
							int exisId1 = sc.nextInt();
							hos.deletedPatientById(exisId1);
							break;
							
				case 5 :	System.out.print("Enter Name to be deleted : ");
							String existname1 = sc.next();
							hos.deletPatientDetailsByName(existname1);
							break;
						
				default : System.out.println("Entered choice cannot be processed ");			
			
			}			
			System.out.print("Do you want to continue Y/N:");
			option = sc.next();
		}
		while(option.equals("Y") );	
	}
	 
	 
  }
 
 
	   
	   
	   
	   
	

