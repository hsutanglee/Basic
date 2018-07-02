package M4Practice4;


public class No3 {
	public static void main(String[] args) {
	int [][][] data = {{{200,200,200},{300,300,300},{100,100,100},{100,100,100}},
			{{200,200,200},{300,300,300},{100,100,100},{100,100,100}},
			{{200,200,200},{300,300,300},{100,100,100},{100,100,100}},
			{{200,200,200},{300,300,300},{100,100,100},{100,100,100}},
			{{200,200,200},{300,300,300},{100,100,100},{100,100,100}}};
							
	String input_string = "all", year = "",month="",season="",c;
	int n=input_string.length(),num=0;
	double all =0,years=0,seasons=0,months;
    if (input_string.startsWith("all")&&(n==3)) {
    	System.out.println("all average:");
    	for(int i=0;i<data.length;i++){
    		for (int j=0;j<data[i].length;j++) {
    			for(int k=0;k<data[i][j].length;k++) {
    				
    				all+=data[i][j][k];
    				}	
    			}
    		}
    	System.out.println(all/60);
    	
    	}
    else if (input_string.startsWith("year")&&(n==4||n==5)) {
    	System.out.println("year average:");
    	if(n==4) {
    		for(int i=0;i<data.length;i++){
        		for (int j=0;j<data[i].length;j++) {
        			for(int k=0;k<data[i][j].length;k++) {
        				
        				all+=data[i][j][k];
        				}	
        			}
        		}
        	System.out.println(all/60);
    		
    		
    		
    	}
    	if (n==5) {
    		num=Integer.parseInt(input_string.substring(n-1));
    		int i=num-1;
    		System.out.println(num);
        		for (int j=0;j<4;j++) {
        			for(int k=0;k<3;k++) {
        				all+=data[i][j][k];
        				}	
        			}
        		
        	System.out.println(all/12);
    		
    	}
    }
	
    else if (input_string.startsWith("season")&&(n==6)) {
    	System.out.println("season average:");
    }
    
    else if (input_string.startsWith("month")&&(n==5)) {
    	System.out.println("month average:");
    }else System.out.println("wrong input, please go with year, season, month or all");
    
		
	}
}
