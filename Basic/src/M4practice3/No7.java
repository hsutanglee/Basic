package M4practice3;

public class No7 {
	static int sumM2(int num) {//�g�@���j���int sum (int n)�Ψӭp��2+4+6�K+2n���ȡC
		if (num!=1)
		return num*2+sumM2(num-1);
		return 2;
	}

	public static void main(String[] args) {
		int num = 4;
		int output = sumM2(num);
		System.out.println(output);

	}

}
