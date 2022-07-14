
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
			System.out.println(note[i].getId()+"  "+note[i].getName()+"   "+note[i].getAddress()+"    "+note[i].getContactNo()+"    ");
		}
	}
	
	   public boolean updateTerminalsNameById(int id,String name){
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
	
	 public boolean deletTerminalesDetailsByName(String name){
	   
	   System.out.println("creat the deletTerminalsDetailsByName() ");
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
	   
}

	
	  