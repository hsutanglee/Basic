package M4Practice4;

public class No1_1 {

	public static void main(String[] args) {
		//input from main args
		// find array max, and min.
		
	
		int max_found=0;
		
		for (int i=0;i<args.length;i++) {
		
			if(max_found < Integer.parseInt(args[i])) max_found =Integer.parseInt(args[i]);
		}
		System.out.println("max is "+max_found);
		
		int min_found=max_found;
		
		for (int i=0;i<args.length;i++) {
			
			if(min_found >Integer.parseInt(args[i]))min_found =Integer.parseInt(args[i]);
		}
		System.out.println("min is "+min_found);
		
	}
}
