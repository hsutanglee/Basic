package M3practice1;

public class year2 {

	public static void main(String[] args) {
		int year = 101;
		if (year%4000 == 0) System.out.println("no");
		else if (year % 400 == 0)System.out.println("yes");
		else if (year % 100 ==0 )System.out.println("no");
		else if (year % 4 ==0 )System.out.println("yes");
		else System.out.println("no");
		
	}

}
