package M4practice3;

public class No5_1 {
//if Prime
	static boolean IsPrime(int value) {//寫一函數int prime (int n)用來找出第n個質數。 very fast in 2 secs.
		boolean result = true;
		for(int i=2;i<value;i++) {
			if (value%i==0) {
				result =false;
				break;
			}
		}
		return result;
	}
//if Mersenne
	static boolean Is_Mersenne(int value) {
		boolean result=true;
		value+=1;
		while (value> 1) {
			if ((value)%2!=0) {result=false;break;}
			else value/=2;
		}
		
		return result;
	}
//if Mersenne_Prime
	static boolean Mersenne_Prime(int value) {
		boolean result=false;
		
		if (Is_Mersenne(value)&&IsPrime(value)) result=true;//faster ifMersenne false then don't do IsPrime loop
		// should choose well the sequence on boolean operation
		return result;
	}
	
	
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]),count=0,i=1;
		while(count< n) {
			if (Mersenne_Prime(i)) { System.out.println(i);
			count++;}
			i++;
			
		}
		
	}

}
