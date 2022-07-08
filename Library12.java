class Library12{

	BooksDTO[] note;
	
	public Library12(int size){
		note = new BooksDTO[size];
		System.out.println("books constuctor is created");
	}
   int index;

	public boolean creatbooks(BooksDTO not){
		System.out.println("Inside creat books");
		boolean isAdded=false;
		if(not!=null && not.getName() !=null){
			this.note[index++]=not;
			isAdded=true;
			System.out.println("books are created successfully");
		}
		else{
			System.out.println("can  dont add books...");
		}
		return isAdded;
	
	}
	public void getBooksDetalies(){
		System.out.println("library get the books detalies");
		
		for(int i=0;i<note.length ;i++){
			System.out.println(note[i].getId()+"  "+note[i].getName()+"   "+note[i].getAuthor()+"    "+note[i].getContactNo()+"    ");
		}
	}
}