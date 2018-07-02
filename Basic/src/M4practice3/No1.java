package M4practice3;
//寫一函數int power(int x, int n)用來計算x的n次方。說明：power(5,3)即計算53。

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
