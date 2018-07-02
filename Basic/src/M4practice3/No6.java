package M4practice3;

public class No6 {
	static int Factorial(int num) {//寫一遞迴函數int factorial (int n)用來計算1*2*3*…*n的值。
		if (num!=1)
		return num*Factorial(num-1);
		return 1;
	}

	public static void main(String[] args) {
		int num = 5;
		int output = Factorial(num);
		System.out.println(output);

	}

}
