package M4practice3;

public class No6 {
	static int Factorial(int num) {//�g�@���j���int factorial (int n)�Ψӭp��1*2*3*�K*n���ȡC
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
