class Airport{

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
}