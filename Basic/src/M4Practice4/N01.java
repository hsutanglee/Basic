package M4Practice4;

public class N01 {

	public static void main(String[] args) {
		// find array max, and min.
	
		
		int[] x = {3,4,2,5,6,1,6,7,6,2};
		
		int max_found=0;
		
		for (int i=0;i<x.length;i++) {
			
			if(max_found < x[i])max_found =x[i];
		}
		System.out.println("max is "+max_found);
		
		int min_found=max_found;
		
		for (int i=0;i<x.length;i++) {
			
			if(min_found > x[i])min_found =x[i];
		}
		System.out.println("min is "+min_found);
		
	}

}
