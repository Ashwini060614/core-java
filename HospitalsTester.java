 
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
	  hos. getPatientDetails();
	
	

	 System.out.println("enter the existing id ");
	 int existingId=sc.nextInt();
	 System.out.println("Enter the updatedaddress ");
	  String updatedAddress=sc.next();
	  
	  	 System.out.println("updateAddress is successfull update");

	 hos.updatePatientAddressById(existingId,updatedAddress);
	 	  hos. getPatientDetails();
	 
	   
	   
	   //invoking datePatientContactNoByName
	  System.out.println("Enter the existing name");
	   String existingName=sc.next();
	   hos.deletPatientDetailsByName(existingName);
	   hos.getPatientDetails();
	     
	 
  }
 }
 
	   
	   
	   
	   
	

