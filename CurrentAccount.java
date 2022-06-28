class CurrentAccount extends BankAccount{

  double interestRate;
  int freeTransactions=10;
  int transactionCount;
  double transactionFee;
  double totalTransactionFee;
  
  public CurrentAccount(double interestRate,double transactionFee){
    this.interestRate=interestRate;
	this.transactionFee=transactionFee;

  }
    public void deposit( double amt){
  System.out.println("Amount to be deposit"+amt);
  System.out.println("Amount before deposit"+amount);
    amount=amount+amt;
	System.out.println("Amount after Deposit"+amount);
	transactionCount++;
}
    public void withDraw(double amt){
  System.out.println("Amount to be withDraw"+amt);
  System.out.println("Amount before withdraw"+amount);
    amount=amount-amt;
	System.out.println("Amount after withDraw"+amount);
	transactionCount++;
}
  public double getBalance(){
	System.out.println("Totl amount available in account is"+amount) ;

	  return amount;
	  
  }
  public double deductionOfFee(){
	 double totalTransactionFee=0;

if(transactionCount>freeTransactions){

   totalTransactionFee=transactionFee*(transactionCount-freeTransactions);
   amount=amount-totalTransactionFee;
   System.out.println("the totalTransactionFee is "+totalTransactionFee);
   System.out.println("the balance amount after deduction of totalTransactionFee is "+amount);
}	 
  else{
	  
	  getBalance();
  }	  
	  
	return totalTransactionFee;  
	  
  } 

  public double periodicInterest(){
	  double interest=getBalance()*interestRate/100;
	  deposit(interest);
	  
	  return interest;
	    
  }
}
