package Module5;

public class CheckingAccount extends Account {
	int checkCount;
	CheckingAccount(String accountNo, double balance,int checkCount){
	super(accountNo,balance);
	this.checkCount=checkCount;
	}
	
	void printAccData(){
	super.printAccData();
		System.out.println("checkCount: "+checkCount);
	}
}

