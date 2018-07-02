package Module4;

public class Factor1 {
	static long factorial(int num) {
		long result=1;
		for (int i=1;i<=num;i++) {
			result*=i;
		}
		return result;
	}

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		System.out.println(factorial(num));
		
	}

}
