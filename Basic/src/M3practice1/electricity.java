package M3practice1;
import java.util.Scanner;
public class electricity {

	public static void main(String[] args)
	{
		int typeno=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("輸入何種用電 1.家庭用電,2.工業用電");typeno =scanner.nextInt();
	
		if(typeno==1) {typeno = 1;System.out.println("1.家庭用電");}
		if(typeno==2) {typeno = 2; System.out.println("2.工業用電");}
		
		System.out.println("輸入度數");int num = scanner.nextInt();
		System.out.println("度數:"+num);
		scanner.close();
		double fee=0;
		
		if ( num<= 240){ if (typeno==1)fee=num*0.15; else fee=num*0.45;}
		//else{if(240~540(含)度){ 0.25元			0.45元}
		//else{540度以上        	0.45元			0.45元}
		
		else { if((num > 240)&(num<=540)){ if (typeno==1)fee=num*0.25; else fee=num*0.45;}
			else {{ if (typeno==1)fee=num*0.45; else fee=num*0.45;}}
			}
		System.out.println("電費:"+fee+"元");
		}
}
