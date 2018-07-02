package Module5Practice;

public class Manager1 extends Manager{
	private	int allowance_traffic;
	public	Manager1(String name,String sex,String date, String phoneNo, String address,int salary,int overtimeHours,int allowance_lunch,int allowance_management,int allowance_traffic){
		super(name,sex,date,phoneNo,address,salary,overtimeHours,allowance_lunch,allowance_management);
		this.allowance_traffic=allowance_traffic;
	}
	
	public int getAllowance_traffic() {
		return allowance_traffic;
	}

	public void setAllowance_traffic(int allowance_traffic) {
		this.allowance_traffic = allowance_traffic;
	}

	public	void printData() {
		super.printData();
		System.out.println("Traffic allowance: \t"+ allowance_traffic);
	}
}
