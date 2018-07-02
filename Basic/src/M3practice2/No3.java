package M3practice2;

public class No3 {

	public static void main(String[] args) {
		for (int j=1;j<100;j++){
		
		System.out.println(j+"¦]¼Æ");
		int sum=0;
		for(int i=1;i<=j;i++) {
			if(j%i==0) { sum+=i;	System.out.println(i);		
							if (j== sum/2)System.out.println(i+"\t is perfect number");
						}
			
			}
		}
	}

}
