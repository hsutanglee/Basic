package M3practice2;

public class No7 {

	public static void main(String[] args) {
		int rabbitnum=0;
		while(!((rabbitnum%3==1)&&(rabbitnum%5==3)&&(rabbitnum%7==2)))rabbitnum+=1;
		System.out.println(rabbitnum);

	}

}