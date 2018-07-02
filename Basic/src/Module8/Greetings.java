/**
 * 
 */
package Module8;

/**
 * @author hsutanglee
 *
 */
class Greetings {

	/**
	 * @param args java.lang.ArrayIndexOutOfBoundsException
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] greetings= {"Hello","Hi!","Good"};
		try {
		for(int i=0;i<4;i++) {
			System.out.println(greetings[i]);
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
