
import java.util.Arrays;
public class Library12{

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
			System.out.println(note[i]);
		}
	}
	
	   public boolean updateBookssNameById(int id,String name){
	System.out.println("Inside creat terminals");
	boolean isUpdate=false;
	for(int i=0; i<note.length;i++){
		if(note[i].getId()==id){
			note[i].setName(name);
			isUpdate=true;
			
		}
		else{
			System.out.println("can not update terminales");
		}
			
	}	
		return isUpdate;	
	}
	   public boolean updateBooksContactNoById(int id,long contactNo){
	System.out.println("Inside creat Books");
	boolean isUpdate1=false;
	for(int i=0; i<note.length;i++){
		if(note[i].getId()==id){
			note[i].setContactNo(contactNo);
			isUpdate1=true;
			
		}
		else{
			System.out.println("can not update books");
		}
			
	}	
		return isUpdate1;	
	}
	 public boolean deletBooksDetailsByName(String name){
	   
	   System.out.println("creat the deletBooksDetailsByName() ");
	   boolean isdateContactNo=false;
	   int i,j;
	   for(i=0,j=0; j<note.length;j++){
		   if(!note[j].getName().equals(name)){
			   note[i++]=note[j];
			 isdateContactNo=true;
		   }	// System.out.println("the patient contactNo is delet");
		//patis=Arrarys.copyof(patis,i);
	   
	   else{
		   System.out.println("");
	   }
	   }
	   note=Arrays.copyOf(note,i);
	   return isdateContactNo ;
	 }
	  
	   public boolean deletBooksDetailsById(int id){
	   System.out.println("creat the delet books DetailsById() ");
	   boolean isdateContactNo1=false;
	   
	   int newIndex,oldIndex;
	   for( newIndex=0,oldIndex=0; oldIndex<note.length;oldIndex++){
		   if(!(note[newIndex].getId()==id)){
		   note[newIndex++]= note[oldIndex];
			 isdateContactNo1=true;
		   }	
	   
	   else{
		        System.out.println("");
	       }
	   }
	   
	   note = Arrays.copyOf(note,newIndex);
	   
	   
	   // isdateContactNo=true;
	   return isdateContactNo1; 
}

	
}