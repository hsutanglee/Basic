package M3practice1;
import java.util.Scanner;
public class electricity {

	public static void main(String[] args)
	{
		int typeno=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("��J��إιq 1.�a�x�ιq,2.�u�~�ιq");typeno =scanner.nextInt();
	
		if(typeno==1) {typeno = 1;System.out.println("1.�a�x�ιq");}
		if(typeno==2) {typeno = 2; System.out.println("2.�u�~�ιq");}
		
		System.out.println("��J�׼�");int num = scanner.nextInt();
		System.out.println("�׼�:"+num);
		scanner.close();
		double fee=0;
		
		if ( num<= 240){ if (typeno==1)fee=num*0.15; else fee=num*0.45;}
		//else{if(240~540(�t)��){ 0.25��			0.45��}
		//else{540�ץH�W        	0.45��			0.45��}
		
		else { if((num > 240)&(num<=540)){ if (typeno==1)fee=num*0.25; else fee=num*0.45;}
			else {{ if (typeno==1)fee=num*0.45; else fee=num*0.45;}}
			}
		System.out.println("�q�O:"+fee+"��");
		}
}
