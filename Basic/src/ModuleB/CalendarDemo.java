package ModuleB;
import java.util.Calendar;
import java.util.Date;

import java.text.SimpleDateFormat;
public class CalendarDemo {

	public static void main(String[] args) {
		long start = new Date().getTime();
		
		Calendar today=Calendar.getInstance();
		int year =today.get(Calendar.YEAR);
		int month =today.get(Calendar.MONTH)+1;
		int day =today.get(Calendar.DATE);
		int day_of_week =today.get(Calendar.DAY_OF_WEEK);
		int hour =today.get(Calendar.HOUR_OF_DAY);
		int minute =today.get(Calendar.MINUTE);
		int second=today.get(Calendar.SECOND);
		
		System.out.println("���ѬO"+year+"/"+month+"/"+day);
		System.out.println("���ѬO�P��"+(day_of_week-1)+"\tSunday will show ���ѬO�P��0");// Sunday will show ���ѬO�P��0, 
		                                                //so it is wrong on Sunday
		switch(day_of_week) {
		case 1:System.out.println("���ѬO�P����");break;
		case 2:System.out.println("���ѬO�P���@");break;
		case 3:System.out.println("���ѬO�P���G");break;
		case 4:System.out.println("���ѬO�P���T");break;
		case 5:System.out.println("���ѬO�P���|");break;
		case 6:System.out.println("���ѬO�P����");break;
		case 7:System.out.println("���ѬO�P����");break;
		
		}
		String []s =new String[]{"���ѬO�P����","���ѬO�P���@","���ѬO�P���G","���ѬO�P���T","���ѬO�P���|","���ѬO�P����","���ѬO�P����"};
		System.out.println(s[day_of_week-1]+"\tarray");
		
		//can use charAT
				String s1="�Ѥ@�G�T�|����";
				System.out.println("���ѬO�P��"+s1.charAt(day_of_week-1)+"\tuse charAT");
		
		System.out.println("�ɶ��O"+hour+":"+minute+":"+second);
		System.out.printf("�ɶ��O%2d:%02d:%02d\tusing print format%n",hour,minute,second);// print format
		
		System.out.println("�ɶ��O"+hour+":"+
		
				((minute<10)?"0"+minute:minute)+":"+
		
				((second<10)?"0"+second:second)+"\t�T���B��l");//�T���B��l
		
		
		Date myDate=today.getTime();
		SimpleDateFormat df2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println("�ɶ��O"+df2.format(myDate)+"\tby API");
		
		
		long end = new Date().getTime();
		
		
		
		System.out.println("run time =" +(end-start)+" ms");
		
	}

}
