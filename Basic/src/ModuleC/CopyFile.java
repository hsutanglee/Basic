package ModuleC;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;

public class CopyFile {

	public static void main(String[] args) {
		//File file=new File(args[0]);
		//File file1=new File(args[1]);
		String infile=args[0];
		String outfile1=args[1];
		try {
			BufferedReader in=new BufferedReader(new FileReader(infile));
			PrintWriter out=new PrintWriter(new FileWriter(outfile1));//===============write
			StringBuilder sb = new StringBuilder(256);
			String str;
			while ((str=in.readLine())!=null)
				sb.append(str).append("\n").append("copyed ==");
			out.print(sb);
			out.close();
			in.close();

	}catch(IOException e) {e.printStackTrace();}
	
		//===============write
		
		
		
		
	}

}
