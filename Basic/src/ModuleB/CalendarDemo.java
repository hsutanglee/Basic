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
		
		System.out.println("今天是"+year+"/"+month+"/"+day);
		System.out.println("今天是星期"+(day_of_week-1)+"\tSunday will show 今天是星期0");// Sunday will show 今天是星期0, 
		                                                //so it is wrong on Sunday
		switch(day_of_week) {
		case 1:System.out.println("今天是星期天");break;
		case 2:System.out.println("今天是星期一");break;
		case 3:System.out.println("今天是星期二");break;
		case 4:System.out.println("今天是星期三");break;
		case 5:System.out.println("今天是星期四");break;
		case 6:System.out.println("今天是星期五");break;
		case 7:System.out.println("今天是星期六");break;
		
		}
		String []s =new String[]{"今天是星期天","今天是星期一","今天是星期二","今天是星期三","今天是星期四","今天是星期五","今天是星期六"};
		System.out.println(s[day_of_week-1]+"\tarray");
		
		//can use charAT
				String s1="天一二三四五六";
				System.out.println("今天是星期"+s1.charAt(day_of_week-1)+"\tuse charAT");
		
		System.out.println("時間是"+hour+":"+minute+":"+second);
		System.out.printf("時間是%2d:%02d:%02d\tusing print format%n",hour,minute,second);// print format
		
		System.out.println("時間是"+hour+":"+
		
				((minute<10)?"0"+minute:minute)+":"+
		
				((second<10)?"0"+second:second)+"\t三元運算子");//三元運算子
		
		
		Date myDate=today.getTime();
		SimpleDateFormat df2 = new SimpleDateFormat("hh:mm:ss");
		System.out.println("時間是"+df2.format(myDate)+"\tby API");
		
		
		long end = new Date().getTime();
		
		
		
		System.out.println("run time =" +(end-start)+" ms");
		
	}

}
