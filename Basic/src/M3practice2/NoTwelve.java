package M3practice2;

public class NoTwelve {

	public static void main(String[] args) {
		int LoanMoney=100000;
		double BankRate=0.2/12,ARate=0.1,CRate=0.01*365;
		for (int i=1;i<=12;i++) {
			System.out.print("M"+i+"\t"+LoanMoney*BankRate*i+"\n"+LoanMoney*ARate*i+"\n"+LoanMoney*CRate*i/12+"\n");
			
		}

	}

}
