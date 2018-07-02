package M3practice1;

public class Equation {

	public static void main(String[] args) {
	int a=1,b=2,c=1;
	int d=(b*b)-(4*a*c);
	System.out.println(d);
	if (d> 0)System.out.println("有兩個不相等的實根");
	if (d== 0)System.out.println("有兩個相等的實根");
	if (d< 0)System.out.println("沒有實根");

	}
}
