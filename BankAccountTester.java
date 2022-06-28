class BankAccountTester
{
	public static void main(String a[])
	{
	  
		SavingsAccount sa =new SavingsAccount(0.4);
		sa.deposit(5000.00);
		sa.withDraw (400.00);
		double amount =sa.getBalance();
		System.out.println("Balance of existing account"+amount);
		sa.periodicInterest();
		
		SavingsAccount other=new SavingsAccount(0.4);
		
		
		sa.transfer(2000.00,other);
		double totalAmount=other.getBalance();
		System.out.println("Balance of other account"+totalAmount);
		 
		 
		 CurrentAccount ca=new CurrentAccount(1.0,3.0);
		System.out.println("Start of Current account mrthod******************");
		ca.deposit(2000.00);
		ca.withDraw(300.00);
		ca.deposit(5700.00);
		ca.withDraw(4000.00);
		ca.deductionOfFee();
		ca.periodicInterest();
		
	}

}