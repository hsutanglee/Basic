package Module8;
//p154
public class Distance {
	private int feet;
	private int inch;
	private final int INCH_PER_FEET=12;
	public Distance(int feet,int inch)throws OverInchException{
		if (inch>INCH_PER_FEET) {
			throw new OverInchException("Over Inch",inch); 
		}
		this.feet=feet;
		this.inch=inch;
	}
	public int getFeet() {
		return feet;
	}
	public int getInch() {
		return inch;
	}
	public static void main(String[] args) {
		try {
			Distance d1=new Distance(4,9);
			System.out.println("feet, inch  ="+d1.getFeet()+" , "+d1.getInch());
			Distance d2=new Distance(4,14);
			System.out.println("feet, inch  ="+d2.getFeet()+" , "+d2.getInch());
		} catch(OverInchException e) {
			System.out.println(e.getMsg()+", wrong inch input="+e.getInch());
		}
		
	}

}

