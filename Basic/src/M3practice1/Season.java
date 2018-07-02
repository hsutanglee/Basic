
package M3practice1;
import java.util.Scanner;
public class Season {
	public static void main(String[] args) {
		System.out.println("which month, input by number 1,2,3...12");
		Scanner scanner = new Scanner(System.in);
		int month = 1;
		month = scanner.nextInt();scanner.close();
		switch(month){
			case 1:System.out.println("Jan"+":winter");break;
			case 2:System.out.println("Feb"+":Spring");break;
			case 3:System.out.println("Mar"+":Spring");break;
			case 4:System.out.println("Apr"+":pring");break;
			case 5:System.out.println("May"+":Summer");break;
			case 6:System.out.println("Jun"+":Summer");break;
			case 7:System.out.println("Jul"+":Summer");break;
			case 8:System.out.println("Aug"+":Autumn");break;
			case 9:System.out.println("Sep"+":Autumn");break;
			case 10:System.out.println("Oct"+":Autumn");break;
			case 11:System.out.println("Nov"+":winter");break;
			case 12:System.out.println("Dec"+":winter");break;
			default:System.out.println("wrong input");		
		}
	}
}
