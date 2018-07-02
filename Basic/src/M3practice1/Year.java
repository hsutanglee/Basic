package M3practice1;
import java.util.Scanner;
public class Year {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year =0;
		System.out.println("please input which year");
		year = scanner.nextInt();
		scanner.close();
		if (year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0) {
					if(year%4000 == 0) System.out.println("«D¶|¦~");
						else System.out.println("¶|¦~");
				}
				else System.out.println("«D¶|¦~");
			} 
			else System.out.println("¶|¦~");
		}
		else System.out.println("«D¶|¦~");
	}
		


}
