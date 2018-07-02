package Module3;
import java.util.Scanner;
public class NestIfWithImport {

	public static void main(String[] args) {
		System.out.println("please input score:");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		if(num>=60) {// judge if > 60---           if 1
			System.out.println("passed");
								//If yes, then judge if < 80 or > 80, if 2
			if(num<80) {
				System.out.println("soso");
			}
			else 
				System.out.println("good");
			
			}		//------------------------------------------------ if 2
		//if < 60 then failed
		else {
			System.out.println("failed");
		}//---------
	}

}
