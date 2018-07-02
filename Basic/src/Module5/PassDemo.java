package Module5;

public class PassDemo {
	int data;
	void passInt(int value) {value=22;}
	void passObj(PassDemo ref) {ref.data=99;}
	
	
	public static void main(String[] args) {
		int val=11;
		PassDemo pt = new PassDemo();
		System.out.println("before "+val);
		pt.passInt(val);
		System.out.println("after "+val);
		
		pt.data=101;
		System.out.println("before "+pt.data);
		pt.passObj(pt);
		System.out.println("after "+pt.data);

	PassDemo pt1 = new PassDemo();
	
	pt.data=101;
	System.out.println("o pt1 "+pt1.data);
	System.out.println("o pt "+pt.data);
	pt1.data= pt.data;
	System.out.println("before pt1 "+pt1.data);
	pt.passObj(pt);
	System.out.println("after "+pt.data);
	System.out.println("after pt1 "+pt1.data);
	
	}

}
