package Module8;

public class Greetings2 {
	
	 String[] greetings= {"Hello","Hi!","Good"};
	public  void printGreetings(int i) throws Exception{ //add throws Exception, so need to be inside try catch                                                                      
		System.out.println(greetings[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greetings2 g=new Greetings2();
		try {
		for(int i=0;i<4;i++) {
			g.printGreetings(i);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBounds!");
		}catch(Exception e) {
			System.out.println("exception happened!");
		}finally {
		System.out.println("always printed");
		}
		
		System.out.println("program end!");

	}

}