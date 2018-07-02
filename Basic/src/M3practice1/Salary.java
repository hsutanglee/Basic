package M3practice1;

public class Salary {

	public static void main(String[] args) {
		/*輸入便利商店工讀生的工作時數，並計算其薪資。
60小時以內，時薪120元。
61~80小時，以時薪1.25倍計算。
81小時以上，以時薪1.5倍計算。
說明：薪資以累計方式計算。若工時為90小時，則薪資為60*120 + */
		int workHour=81;
		double payment=0;
	
		if (workHour <=60) payment = workHour*120;
		if ((workHour > 60)&&(workHour<=80)) payment = (60+(workHour-60)*1.25)*120;
		if (workHour > 80) payment =(60+20*1.25+(workHour-80)*1.25)*120;
		System.out.println("Workhours:"+workHour);
		System.out.println("Payment:"+payment);
		
		

	}

}
