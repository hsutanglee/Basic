package M4practice3;

public class No5 {
	static boolean ifMersennePrime(int num) {//run longer than No5_1, 3~4 mins, same result,need add break in prime loop, still slower than No5_1
		boolean result = true;
		int n=num+1;
		if (num!=1) {// if Prime
			for (int i=2;i<num;i++) {
				if (num%i ==0) {result = false;break;}
				
			}
			}	
		do{
			if(n%2!=0) {result = false;break;}
			else n/=2;
		}while (n>1);
		return result;
	}
	
	
	public static void main(String[] args) {
		int count =0,num=1;
		while(count<8) {
		if(ifMersennePrime(num)) {count++;System.out.println(num);}
		num++;
		}

	}
	
}