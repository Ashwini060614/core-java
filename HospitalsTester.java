class HospitalsTester{

  public static void main(String a[]){
      
	  Hospitals hos =new Hospitals();
	  
    PatientDTO pati =new PatientDTO();
	   pati.setGender(Gender.male);
       pati.setName("Avi");
	   pati.setAddress("Bengaluru");
       pati.setContactNo(1234567890L);
        hos.creatPatient(pati);
		
	PatientDTO pati1 =new PatientDTO();
	   pati1.setGender(Gender.female);
       pati1.setName("racana");
	   pati1.setAddress("Badagi");
       pati1.setContactNo(73632467890L);
	    hos.creatPatient(pati1);
		
    PatientDTO pati2 =new PatientDTO();
	   pati2.setGender(Gender.male);
       pati2.setName("praveen");
	   pati2.setAddress("Bilagi");
       pati2.setContactNo(319826890L);
	   hos.creatPatient(pati2);
	   
	PatientDTO pati3 =new PatientDTO();
	   pati3.setGender(Gender.female);
       pati3.setName("sanvi");
	   pati3.setAddress("Mysore");
       pati3.setContactNo(962567890L);
	    hos.creatPatient(pati3);
		
	PatientDTO pati4 =new PatientDTO();
	   pati4.setGender(Gender.transgender);
       pati4.setName("krishna");
	   pati4.setAddress("vijaypur");
       pati4.setContactNo(98542890L);
	     hos.creatPatient(pati4);
		
	   
  	System.out.println(pati.getName()+"    "+pati.getAddress()+"  "+pati.getGender()+"  "+pati.getContactNo());
	System.out.println(pati1.getName()+"    "+pati1.getAddress()+"  "+pati1.getGender()+"  "+pati1.getContactNo());
	System.out.println(pati2.getName()+"    "+pati2.getAddress()+"  "+pati2.getGender()+"  "+pati2.getContactNo());
	System.out.println(pati3.getName()+"    "+pati3.getAddress()+"  "+pati3.getGender()+"  "+pati3.getContactNo());
	System.out.println(pati4.getName()+"    "+pati4.getAddress()+"  "+pati4.getGender()+"  "+pati4.getContactNo());
} 
  }

