class EngineerTester{ 

  public static void main(String a[]){
	  
    Engineer engg=new Engineer();
		 engg.duration=" 4 years";
         engg.collegeName=" UTO";
         engg.address="Bagalkot";

		 engg.problemSolving();
		 System.out.println(engg.duration+"   "+engg.collegeName+"   "+engg.address+"  ");
	 
        CivilEngineer civil =new CivilEngineer();
		 civil.designProblemSolving();

         MechEngineer mech =new MechEngineer();
          mech.developmentProblemSolving();

         CsEngineer cs=new CsEngineer();
		 cs.TechnicalProblemSolving();

         AeronauticalEngineer aer=new AeronauticalEngineer();
          aer.aircraftProblemSolving();




	
    }
}