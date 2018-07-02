package Module3;

public class PrintfDemo {

	public static void main(String[] args) {
		System.out.printf("/%5d/%n",123);//decimal 5
		System.out.printf("/%+5d/%n",123);//decimal 5 with +
		System.out.printf("/%X/%n",123);//Hex Cap
		System.out.printf("/%x/%n",123);
		System.out.printf("/%#x/%n",123);// full Hex expression 
		System.out.printf("/%f/%n",12345.678);
		System.out.printf("/%10.2f/%n",12345.678);
		System.out.printf("/%-10.2f/%n",12345.678);
		System.out.printf("/%010.2f/%n",12345.678);
		System.out.printf("/%10.2e/%n",12345.678);
		System.out.printf("/%,10.2f/%n",12345.678);
		System.out.printf("/%,10.2g/%n",12345.678);// print which shorter
		System.out.printf("/%(10.1f/%n",-12345.678);
		System.out.printf("/%10s/%n","student");
		
		int sec=200;
		System.out.println(sec/60+"¤À"+sec%60+"¬í");
		final int SEC_PER_MIN =60;
		System.out.println(sec+"¬í="+sec/SEC_PER_MIN+"¤À"+sec%SEC_PER_MIN+"¬í");
		System.out.printf("%d¬í=%d¤À%d¬í",sec,sec/SEC_PER_MIN,sec%SEC_PER_MIN);









	}

}
