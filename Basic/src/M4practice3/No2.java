package M4practice3;

public class No2 {
	static long factorial(int num) {
		long result=1;
		for (int i=1;i<=num;i++) {
			result*=i;
		}
		return result;
	}
	
	static long power(int value, int exp) {
		long result = 1;
		for (int i=1; i<=exp;i++) {
			result*=value;
		}
		return result;
	}
	static double myFun(int x, int n) {
		double result=0,itemValue =0;
		for (int i=1;i<=n;i++) {
			itemValue =(float) power(x,i)/ factorial(i);
			System.out.println("x\t"+x+"\tn\t"+n+"\ti\t"+i);
			System.out.println("power\t"+power(x,i));
			System.out.println("factorial\t"+factorial(i));
			System.out.printf("%.2f%n",itemValue);
			result+=itemValue;
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.printf("%s%.2f","result= ",myFun(4,4));
	}

}
