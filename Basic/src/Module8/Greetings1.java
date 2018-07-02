package Module8;

public class Greetings1 {
	
	static String[] greetings= {"Hello","Hi!","Good"};
	public static void printGreetings(int i) {
		System.out.println(greetings[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		for(int i=0;i<4;i++) {
			printGreetings(i);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBounds!");
		}catch(Exception e) {
			System.out.println("exception happened!");
		}finally {
		System.out.println("always printed");
		}
		
		System.out.println("program end!");

	}

}