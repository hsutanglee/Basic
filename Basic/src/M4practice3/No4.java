package M4practice3;

public class No4 {
	static boolean IsPrime(int value) {//寫一函數int prime (int n)用來找出第n個質數。
		boolean result = true;
		for(int i=2;i<value;i++) {
			if (value%i==0) {
				result =false;
				break;
			}
		}
		return result;
	}
	
	 static void Prime(int n) {
		int count =1, i=1;
		while (count <=n) {
			if (IsPrime(i)) {
			System.out.println(i+" is the number with no."+count);
			count++;
			}
			i++;
		}	
	 }
	public static void main(String[] args) {
		Prime(Integer.parseInt(args[0]));
		
	}
	 
}
