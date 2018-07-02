package Module3;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("please input your name:");
		String name=scanner.next();
		System.out.println(name);
		System.out.println("please input your age:");
		int age=scanner.nextInt();
		System.out.println(age);
		scanner.close();
	
	}

}
