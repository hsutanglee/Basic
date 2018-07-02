package Module3;

public class operatots {

	public static void main(String[] args) {
		int sec=200;
		System.out.println(sec/60+"¤À"+sec%60+"¬í");
		final int SEC_PER_MIN =60;
		System.out.println(sec+"¬í="+sec/SEC_PER_MIN+"¤À"+sec%SEC_PER_MIN+"¬í");
		int a,b,c,d;
		a=10;b=20;c=30;d=40;
		System.out.println("a="+a);
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
		a+=10;b=+5;c*=3;d/=4;//operate then equal
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
		System.out.println("a+=b+10 equal "+(a+=b+10));// operate right express first

		
		int x=3,y=4,z;
//		z=++x*y;
//		System.out.println(z);
		z=(x++)*y;
		System.out.print("x="+x);System.out.print("  y="+y);System.out.println("  (x++)*y="+z);
		x=3;y=4;
		z=(++x)*y;
		System.out.print("x="+x);System.out.print("  y="+y);System.out.println("  (++x)*y="+z);
		x=3;y=4;
		z=x+++y;
		System.out.print("x="+x);System.out.print("  y="+y);System.out.println("  x+++y="+z);
		x=3;y=4;
		int sum=378;
		System.out.println(sum/5);
		System.out.println((double)sum/5);
	}

}
