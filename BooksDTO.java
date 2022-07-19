class BooksDTO{
	
	
  public BooksDTO(){
		
		System.out.println("BooksDTO constuctor is creted");
	}

  
	@Override
	public int hashCode(){
		return this.id;
	}
	private String name;
	private int id;
    private String address;
	private long contactNo;

	
	
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
	
	public String getAddress(){
		return address;
	}
	public void setAuthor(String address ){
		this.address=address;
	}
	public long getContactNo(){
	  return contactNo;
	  
	}
	public void setContactNo(long contactNo){
		this.contactNo=contactNo;
	}
	@Override
	public String toString(){
		
		return"[BooksDTO: Id="+this.id+",Name="+this.name+"]";
	}
	
	}

	
	

	
