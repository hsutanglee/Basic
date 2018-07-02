package M3practice2;

public class NoEleven {

	public static void main(String[] args) {
		double amoney=100000,bmoney=100000;
		int nyear=1;
		while(amoney >= bmoney) {
		amoney=100000*(1+0.1*nyear);System.out.print(nyear+"\t"+amoney+"\t");
		bmoney*=1.05;
		System.out.print(bmoney+"\n");
		nyear++;
		}
		
	}

}
