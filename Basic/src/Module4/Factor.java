package Module4;

public class Factor {
	static long factorial(int num) {
		long result=1;
		for (int i=1;i<=num;i++) {
			result*=i;
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		
	}

}
