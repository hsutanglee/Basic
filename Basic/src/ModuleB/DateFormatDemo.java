package ModuleB;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calendar cal=new GregorianCalendar(1985,Calendar.APRIL,8);
Date myDate=cal.getTime();
int c_year=cal.get(Calendar.YEAR)-1911;
DateFormat df1=DateFormat.getDateInstance();
System.out.println(df1.format(myDate));

SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
System.out.println(df2.format(myDate));

SimpleDateFormat df3 = new SimpleDateFormat("¦~M¤ëd¤é");
System.out.println(c_year+df3.format(myDate));
	}

}
