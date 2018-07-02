package Module5;

public class Account {
	
	double balance;
	String accountNo;
	
	Account(){}
	
	Account(String accountNo, double balance){
		
		this.accountNo= accountNo;
		this.balance = balance;
	}
	
	void printAccData(){
		
		System.out.println("Account No: "+ accountNo);
		System.out.println("balance: "+balance);
	}

	public static void main(String[] args) {
	/*	Account acc = new Account("124654", 50000.0);
		acc.printAccData();
		CheckingAccount ca = new CheckingAccount("168", 50000.0,345);
		ca.printAccData();
		*/
		Account acc[]=new Account[3];
		acc[0]= new CheckingAccount("333",10000,45000);
		acc[1]= new CheckingAccount("433",11000,300);
		acc[2]= new CheckingAccount("555",20000,30000);
		for (int i=0;i<acc.length;i++){
			acc[i].printAccData();
		}

	}

}
