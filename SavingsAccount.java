class SavingsAccount extends BankAccount{
 
   double interestRate;
   
   public SavingsAccount(double interestRate){
     this.interestRate=interestRate;
	 // super() will be called by compiler
	 // calculate periodic Interest
   }
    public double periodicInterest(){
	double interest= getBalance()*interestRate/100;
	deposit(interest);
	 return interest;
	
	}
   
}