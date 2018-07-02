package Module3;

public class NineNine {

	public static void main(String[] args) {
	for (int i=1; i<=9; i++) {
		for (int j=1;j<=9;j++) {
			System.out.print(i+"*"+j+"="+i*j+"\t");
		}//j loop
		System.out.print("\n");
	}// i loop
	System.out.print("\n");
	for (int i=1; i<=9; i++) {
		for (int j=1;j<=9;j++) {
			System.out.print(j+"*"+i+"="+i*j+"\t");
		}//j loop
		System.out.print("\n");
	}// i loop

	}//main

}//class
