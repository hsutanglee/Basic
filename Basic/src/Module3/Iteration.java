package Module3;

public class Iteration {

	public static void main(String[] args) {
		int n=1;
		int sum=0;
		while (n<=10) {
			sum+=n;
			n++;
		}
		System.out.println("while loop sum="+sum);
	//=========================
		n=1;sum=0;
		do {
			sum+=n;
			n++;
		} while(n<=10);
		System.out.println("do   while sum="+sum);
	//=======================	
		sum=0;
		for(n=0;n<=10;n++) {
		sum+=n;	
		}	
		System.out.println("for   loop sum="+sum);
	//=======================	
		sum=0;
		for(n=0;n<=100;n+=2) {
		sum+=n;	
		}	
		System.out.println("for loop 1 to 100 even sum="+sum);
	//=======================
		sum=0;
		for(n=1;n<=100;n+=2) {
		sum+=n;	
		}	
		System.out.println("for loop 1 to 100  odd sum="+sum);
	//========================
		n=0;
		while(true) {n++; if (n>1000)break;}
		System.out.println(n);
		
	}
}


