package M4practice3;
//�g�@���int power(int x, int n)�Ψӭp��x��n����C�����Gpower(5,3)�Y�p��53�C

public class No1 {
	static int power(int value, int exp) {
		int result = 1;
		for (int i=1; i<=exp;i++) {
			result*=value;
		}
		return result;
	
	}

	public static void main(String[] args) {
		int output = power(5,3);
		System.out.println(output);

	}

}
