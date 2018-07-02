package M4practice3;

public class No8 {
	//寫兩個函數分別為toBinary(int n)和toHexidecimal(int n)用來將n轉換成二進制和十六進制的值。
	static String toBin(int num) {	
		String str="";
			do {
				str =String.valueOf(num%2)+str;
			
				num=num/2;
			}while(num!=0);
		return str;
	}
	static String toHex(int num) {	
		String str="",str1="";
		int h=0;
		do {
			h=num%16;
			switch(h){
				case 10: str1 = "A";break;
				case 11: str1 = "B";break;
				case 12: str1 = "C";break;
				case 13: str1 = "D";break;
				case 14: str1 = "E";break;
				case 15: str1 = "F";break;
				default: str1 =String.valueOf(h);
			}
			System.out.println(str1+str);
			str=str1+str;
			num=num/16;
		}while(num!=0);
		
		
		return str;
	}
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		System.out.println(toBin(n));
		System.out.println(toHex(n));
	}

}
