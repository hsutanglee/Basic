package ModuleC;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		File file=new File(args[0]);
		String str;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out=new PrintWriter(new FileWriter(file));
			StringBuilder sb = new StringBuilder(256);
			
			while (!(str=in.readLine()).equals(""))
				sb.append(str).append("\n");
			out.print(sb);
			in.close();out.close();

	}catch(IOException e) {e.printStackTrace();}
	}

}
