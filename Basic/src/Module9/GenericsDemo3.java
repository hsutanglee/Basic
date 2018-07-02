package Module9;

public class GenericsDemo3 {

	public static void main(String[] args) {
		MyStack<Integer>s1=new MyStack<>();
		s1.push(1);
		s1.push(2);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		MyStack<String>s2=new MyStack<>();
		s2.push("John");
		s2.push("Mary");
		System.out.println(s2.pop());
		System.out.println(s2.pop());
		
		
	}

}
