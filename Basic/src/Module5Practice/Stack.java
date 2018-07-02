package Module5Practice;

	public class Stack {
		private int []stack = new int[4];
		public static int Stack_top=0;
		private int value;
		int length;
		public void push(int value) {
			this.value=value;
			stack[(Stack_top)]=value;
			Stack_top++;
			System.out.println(Stack_top+"=top+1");
		}
		public int pop() {
			Stack_top--;
			System.out.println(Stack_top);
			return stack[(Stack_top)];
		}
		public int length() {
			return stack.length;
		}
		public int value(int i) {
			return stack[i];
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s= new Stack();
		System.out.println(s.length());
		for (int i=0;i<s.length();i++) {
		s.push((i));
		System.out.println(i+" "+s.value(i));
		}
		
		for (int i=0;i<s.length()-1;i++) {
			System.out.println("position   "+(Stack.Stack_top-1)+"\t"+s.pop());
			}
		
		
	}

}
