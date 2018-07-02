package M3practice2;

public class No4 {

	public static void main(String[] args) {
		
		for (int i=100;i<1000;i++) {
		
		int num1=i/100;
		int num2 = i%100/10;
		int num3= i%10;
		
		if(i==(num1*num1*num1+num2*num2*num2+num3*num3*num3)) {
			System.out.println(i+"is Amstrong number");
			System.out.println(num1+"\t"+num2+"\t"+num3);
		}
		
		}
	}

}
