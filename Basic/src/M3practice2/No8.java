package M3practice2;
import java.util.Scanner;
public class No8 {

	public static void main(String[] args) {
		String passwd="ss123";
		System.out.println("please input your password:");
		Scanner scanner = new Scanner(System.in);
		String passwdin = scanner.next();
		int times=1;
		do {
			if (passwdin.equals(passwd)) {System.out.println("密碼輸入正確，歡迎使用本系統！");break;}
			System.out.println("請輸入密碼");times+=1;System.out.println(times);
			passwdin = scanner.next();System.out.println(passwdin);
			
		}while(times<3);

		if ((times==3)&&!passwdin.equals(passwd))System.out.println(times+" times over");
		else if (passwdin.equals(passwd))System.out.println("密碼輸入正確，歡迎使用本系統！");
		scanner.close();
		

	}

}
