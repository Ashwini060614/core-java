class BankAccount{

double amount;

 /*public static void main( String a[]){
//invoking deposite method
deposit(12000);
 getTotalAmount();
withdraw(3000);
//invoking deposite method
  getTotalAmount();
deposit(1000);
//invoking withdraw method
  getTotalAmount();
withdraw(4000);
 System.out.println("Total Amount in the account after transaction:"+amount);

//invoking Total Amount method.

}*/


public void deposit( double amt){
  System.out.println("Amount to be deposit"+amt);
  System.out.println("Amount before deposit"+amount);
    amount=amount+amt;
	System.out.println("Amount after Deposit"+amount);
}
public void withDraw(double amt){
  System.out.println("Amount to be withDraw"+amt);
  System.out.println("Amount before withdraw"+amount);
    amount=amount-amt;
	System.out.println("Amount after withDraw"+amount);
}

public double getBalance(){
	System.out.println("The total balance"+amount);
	return amount;
	
}

public void transfer(double tAmount,BankAccount other){
  if(tAmount<=amount)
  {
	  	
	withDraw(tAmount);
	other.deposit(tAmount);
	  
  }
  
 else{
	 
	 System.out.println("The invalid balance");
 }	
	
}
}
