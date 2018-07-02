package Module5Practice;



public class EmployeePMain {

	public static void main(String[] args) {
		//EmployeeP(String name,String sex,String date, String phoneNo, String address,int salary)
		EmployeeP e[]=new EmployeeP[3];
		e[0]= new Staff("John","M","2010/12/3","0921345678","NO3, T city",30000,50);
		e[1]= new Manager1("Sam","M","2000/12/3","0921345456","NO212, F city",80000,50,2000,5000,2000);
		e[2]= new Manager2("Mary","F","1998/12/3","0921345000","NO555, A city",50000,50,2000,3000);
		for (int i=0;i<e.length;i++){
			e[i].printData();	
			System.out.println("Overtime hours: \t"+ e[i].getOvertimeHours());
			System.out.println("Overtime payment: \t"+ e[i].overtimePay());
		}


	}

}
