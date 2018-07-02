package Module4;

public class ArraySumDemo {

	public static void main(String[] args) {
		int sum=0;
		int[] oneDim= {2,6,1,4,3,5};
		for(int i=0;i<oneDim.length;i++) {
			sum +=oneDim[i];
		}
		System.out.println(sum);
		
		sum=0;
		int[][] twoDim = {{2,6,1},{4,3,5}};//rectangular
		for(int i=0;i< twoDim.length;i++) {
			for(int j=0;j< twoDim[i].length;j++) {
				sum += twoDim[i][j];
			}
		}
		System.out.println(sum);
		
		sum=0;
		int[][] twoDimN = {{2,6,1},{4,3,5},{2,3}};//nonRectangular
		for(int i=0;i< twoDimN.length;i++) {
			for(int j=0;j< twoDimN[i].length;j++) {
				sum += twoDimN[i][j];
			}
		}
		System.out.println(sum);
		
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
		
	}

}
