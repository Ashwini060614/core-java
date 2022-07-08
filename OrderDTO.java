class OrderDTO{


	private String name;
	private int id;
    private double price;
	private String date;


	
	public OrderDTO(){
		
		System.out.println("order constuctor is creted");
	}

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
	  return name;
	  
	}
	public void setName(String name){
		this.name=name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public String getDate(){
		return date;
	}
	public void setDate(String date){
		this.date=date;
	}
	
	}

	
	

	
