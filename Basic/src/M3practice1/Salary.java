package M3practice1;

public class Salary {

	public static void main(String[] args) {
		/*��J�K�Q�ө��uŪ�ͪ��u�@�ɼơA�íp����~��C
60�p�ɥH���A���~120���C
61~80�p�ɡA�H���~1.25���p��C
81�p�ɥH�W�A�H���~1.5���p��C
�����G�~��H�֭p�覡�p��C�Y�u�ɬ�90�p�ɡA�h�~�ꬰ60*120 + */
		int workHour=81;
		double payment=0;
	
		if (workHour <=60) payment = workHour*120;
		if ((workHour > 60)&&(workHour<=80)) payment = (60+(workHour-60)*1.25)*120;
		if (workHour > 80) payment =(60+20*1.25+(workHour-80)*1.25)*120;
		System.out.println("Workhours:"+workHour);
		System.out.println("Payment:"+payment);
		
		

	}

}
