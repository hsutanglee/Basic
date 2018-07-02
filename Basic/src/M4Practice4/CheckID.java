package M4Practice4;

public class CheckID {
	
	public Boolean checkID(String str) {
		char []area= {'A','B','C','D','E','F','G','H','I','J','K','M','N','O','P','Q','T','U','V','W','X','Z'};
		boolean result=true,checkNo=true,areaCheck=false;
		for (int i=0;i<area.length;i++) {
			if (str.charAt(0)==area[i]) areaCheck=true;break;
		}
		
		if(str.length() !=10) {result=false;
		System.out.println("wrong ID length");
		}else if(areaCheck==false) {
			System.out.println("wrong ID area code");
		}else if((str.charAt(1)!=1)||(str.charAt(1)!=2)) {
			System.out.println("wrong ID on 2nd number");
		}else if(checkNo) {
			System.out.println("wrong ID check number");	
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
