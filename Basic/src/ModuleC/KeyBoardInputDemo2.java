package ModuleC;
import java.io.*;
public class KeyBoardInputDemo2 {

	public static void main(String[] args) {
		String str;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(!(str=in.readLine()).equals(""))
				System.out.println(str);
			in.close();
		
		}catch(IOException e) {e.printStackTrace();}

	}

}
