package M4practice3;

public class No3 {//寫一函數boolean isPrime (int n)用來判斷n是否為質數。
	static boolean IsPrime(int value) {
		boolean result = true;
		for(int i=2;i<value;i++) {
			System.out.println(value%i);
			if (value%i==0) {System.out.println(value%i);
				result =false;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int num= Integer.parseInt(args[0]);
		System.out.println(num+" is Primary or not? Answer is "+IsPrime(num));

	}

}
