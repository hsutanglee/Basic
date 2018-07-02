package Module4;

public class ArrayForEachDemo {

	public static void main(String[] args) {
		int sum=0;
		int[] oneDim= {2,6,1,4,3,5};
		for(int i=0;i<oneDim.length;i++) {
			sum +=oneDim[i];
		}
		System.out.println(sum);
		sum=0;
		for (int n: oneDim) sum+=n;
		System.out.println(sum+"for each");
		
		sum=0;
		int[][] twoDim = {{2,6,1},{4,3,5}};//rectangular
		for(int i=0;i< twoDim.length;i++) {
			for(int j=0;j< twoDim[i].length;j++) {
				sum += twoDim[i][j];
			}
		}
		System.out.println(sum);
		
		sum=0;
		for (int[]m:twoDim)
			for(int n:m)
				sum+=n;
		System.out.println(sum+"two dim for each");
		
		sum=0;//three demension
		int[][][] threeDim ={ {{2,6,1},{4,3,5}},{{2,6,1},{4,3,5}}};//rectangular [k][j][i]
		for (int k=0;k< threeDim.length;k++) {
		for(int i=0;i< threeDim[k].length;i++) {
			for(int j=0;j< threeDim[k][i].length;j++) {
				sum += threeDim[k][i][j];
			}
		}
		}
		System.out.println(sum);
		sum=0;
		for (int[][]s:threeDim)
			for(int[]m:s)
				for(int n:m)
					sum+=n;
		System.out.println(sum+"three dim for each");
					
		//=================try error
		sum=0;
		for (int[][]s:threeDim)
			for(int[]m:s)
				for(int n:m)
					sum+=n;
		System.out.println(sum+"try three dim for each");
		
		
		
	}

}
