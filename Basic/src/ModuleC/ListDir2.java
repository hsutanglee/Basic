package ModuleC;
import java.io.*;
public class ListDir2 {

	public static void main(String[] args) {
		File file=new File(args[0]);
		if(!(file.isDirectory())){
			System.err.println("Not a directory");
			System.exit(0);
		}
		StringBuilder sb=new StringBuilder(256);
		File[] contents=file.listFiles();
		for(int i=0;i<contents.length;i++) {
		sb.append((contents[i].isFile())?"file:":"dir:");
		sb.append(contents[i].getName()).append("\n");
		}
		System.out.println(sb);
		}
	

}
