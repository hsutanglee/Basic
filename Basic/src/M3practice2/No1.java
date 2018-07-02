package M3practice2;

public class No1 {

	public static void main(String[] args) {
	
		int oddsqrSum=0;
		for(int i=1;i<=49;i+=2) {
			oddsqrSum+=i*i;
			
		}
		System.out.println(oddsqrSum);
		int evensqrSum=0;
		for(int i=0;i<=50;i+=2) {
			evensqrSum+=i*i;
		}
		System.out.println(evensqrSum);
		System.out.println(oddsqrSum-evensqrSum);
		
		
	}

}
