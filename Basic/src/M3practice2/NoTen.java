package M3practice2;

public class NoTen {

	public static void main(String[] args) {
		System.out.print("\t"+"|");
		for (int j=1;j<=9;j++) {
			System.out.print("\t"+j);
		}
		System.out.print("\n");
		for (int j=0;j<44;j++)System.out.print("--");
		System.out.print("\n");
		for (int i=1;i<=9;i++) {
		
			System.out.print((10-i)+"\t"+"|");
			for (int j=1;j<=(10-i);j++)System.out.print("\t"+(10-i)*j);
			System.out.print("\n");
		}

	}

}
