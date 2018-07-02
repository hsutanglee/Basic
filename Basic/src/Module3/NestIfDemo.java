package Module3;

public class NestIfDemo {

	public static void main(String[] args) {
		int num=50;
		if(num>=60) {// judge if > 60---           if 1
			System.out.println("passed");
								//If yes, then judge if < 80 or > 80, if 2
			if(num<80) {
				System.out.println("soso");
			}
			else 
				System.out.println("good");
			
			}		//------------------------------------------------ if 2
		//if < 60 then failed
		else {
			System.out.println("failed");
		}//-------------------------------------if1
	}
}
	

