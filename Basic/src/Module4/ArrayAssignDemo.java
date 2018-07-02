package Module4;

public class ArrayAssignDemo {

	public static void main(String[] args) {
		int[]data= {1,2,3,4,5,6};
		int[]data1 = data;
		System.out.print("original data []  :");
		
		for(int i=0;i<data1.length;i++) {
			System.out.print(data1[i]+"¡A");
		}
		System.out.println();
		System.out.print("data [] *10 :");
		for(int i=0;i<data.length-3;i++) {
			data[i]*=10;
		}
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+"¡A");
		}
		
		System.out.println("\n");
		int []x= {1,2,3,4,5};
		int[]y=new int[x.length];
		for (int i=0;i<x.length;i++){
			y[i]=x[i]*10;
			System.out.println(x[i]);
			System.out.println(y[i]);
		}
	
	}

}
