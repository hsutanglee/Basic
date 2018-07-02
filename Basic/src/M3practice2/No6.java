package M3practice2;

public class No6 {

	public static void main(String[] args) {
		int length=3000;
		int daynum=0;
		while (length > 5) {
			length/=2;
			daynum+=1;
			}
		System.out.println(daynum);
}
}