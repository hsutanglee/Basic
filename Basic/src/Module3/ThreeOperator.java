package Module3;

public class ThreeOperator {

	public static void main(String[] args) {
	int coverage=200,area=300,count;
	count=area/coverage;
	count+=(area%coverage == 0)? 0:1;
	String unit = (count==1)? "can":"cans";
	System.out.println("Need "+count+" "+unit+" to paint");
	System.out.printf("Need %d %4s to paint/%n",count,unit);

	}

}
