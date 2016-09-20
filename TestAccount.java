package lab;

public class TestAccount {
	public static void main(String[] args) {
	      // Test constructor and toString()
	      Account acc1 = new Account(123, 456.67);
	      System.out.println(acc1);  // toString()
	 
	      // Test Setters and Getters
	      acc1.setBalance(231.55);
	      System.out.println(acc1);  // run toString() to inspect the modified instance
	      System.out.println("Balance is: $" + acc1.getBalance());
	 
	      // Test credit()
	      acc1.credit(234.78);
	      System.out.println(acc1);  // toString()
	      
	      //Test debit()
	      acc1.debit(100.45);
	      System.out.println(acc1);
	      System.out.println("Balance is: $" + acc1.getBalance());
	   }
}
