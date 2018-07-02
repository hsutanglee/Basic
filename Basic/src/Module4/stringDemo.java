package Module4;

public class stringDemo {

	public static void main(String[] args) {
		String str = "Hello world, welcome to Java world";
		char s = str.charAt(6);
		System.out.println(s);
		int l=str.length();
		System.out.println(l);
		System.out.println(str.substring(13));
		
		System.out.println(str.indexOf("world"));
		int index=str.indexOf("world");
		System.out.println(str.indexOf("world",7));
		System.out.println(str.indexOf("world",index+1));
		System.out.println(str.indexOf("World"));
		System.out.println(str.lastIndexOf("world"));
		
		String[]tokens=str.split(" ");
		
		for (int i=0;i<tokens.length;i++) {
			System.out.println(tokens[i]);
		}
		tokens=str.split(",");
		
		for (int i=0;i<tokens.length;i++) {
			System.out.println(tokens[i]);
		}
		
		String str1 = "2015-2-11";
		System.out.println(str1.replace('-','/'));
	
		str1 ="Hello world";
		str ="hello world";
		int c=str.compareTo(str1);
		System.out.println(c);
		System.out.println(str.compareTo(str1));
		
		
	}

}
