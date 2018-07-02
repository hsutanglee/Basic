package Module5Practice;

public abstract class Manager extends EmployeeP {
	
	private	int allowance_lunch,allowance_management;
	public Manager(String name,String sex,String date, String phoneNo, String address,int salary,int overtimeHours,int allowance_lunch,int allowance_management){
		super(name,sex,date,phoneNo,address,salary,overtimeHours);
		this.allowance_lunch=allowance_lunch;
		this.allowance_management=allowance_management;
	}
	
	public int getAllowance_lunch() {
		return allowance_lunch;
	}

	public void setAllowance_lunch(int allowance_lunch) {
		this.allowance_lunch = allowance_lunch;
	}

	public int getAllowance_management() {
		return allowance_management;
	}

	public void setAllowance_management(int allowance_management) {
		this.allowance_management = allowance_management;
	}

	public void printData() {
		super.printData();
		System.out.println("Management allowance: \t"+ allowance_management);
		System.out.println("Lunch allowance: \t"+ allowance_lunch);
	}
}
