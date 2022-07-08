class FoodItemsDTO{


	private String name;
	private int id;
    private double price;
	private long contactNo;

	
	public BooksDTO(){
		
		System.out.println("BooksDTO constuctor is creted");
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
	
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author ){
		this.author=author;
	}
	public long getContactNo(){
	  return contactNo;
	  
	}
	public void setContactNo(long contactNo){
		this.contactNo=contactNo;
	}
	
	}

	
	

	
