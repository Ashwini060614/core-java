import java.util.Scanner; 
 
class AirportTester{
	public static void main(String a []){
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("the inter size of terminals are add");
		int size = sc.nextInt();
		Airport air = new Airport(size);
		
		for(int i=0; i<size; i++){
		System.out.println("the inter terminals id");
         int id= sc.nextInt();
		System.out.println("the inter terminals name");
		String name=sc.next();


    	TerminalsDTO dto = new TerminalsDTO();
	     dto.setId(id);
		 dto.setName(name);
		 
		 
			air.creatTerminals(dto);
			//System.out.println(term.getId()+"    "+term.getName()+"  "+term.getTypeOfTerminal()+"  ");
			//sc.getTerminalsDetalies();
		}
		air.getTerminalsDetalies();
		//System.out.println(term.getId()+"    "+term.getName()+"  "+term.getTypeOfTerminal()+"  ");
	}


	
}