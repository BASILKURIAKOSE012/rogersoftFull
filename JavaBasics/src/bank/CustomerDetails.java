package bank;

public class CustomerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String customerName = "Basil";
		long accountNumber = 243555599595l;
		
		float withdrawalAmount = 10000;
		float depositAmount = 30000;
		float balanceAmount = depositAmount-withdrawalAmount;
		
		System.out.println("customer name is " + customerName);
		System.out.println("account number is " + accountNumber);
		System.out.println("amount deposited is "+ depositAmount);
		System.out.println("amount withdrawed is "+ withdrawalAmount);
		System.out.println("your balance amount is " + balanceAmount);
		
		
		

	}

}
