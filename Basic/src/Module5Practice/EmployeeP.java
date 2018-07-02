package Module5Practice;



public abstract class EmployeeP {
	//姓名、性別、到職日、電話和住址
	//列印其基本資料及當月薪資,加班
	private String name,sex,date,phoneNo,address;
	private int salary,overtimeHours;
	
	public	EmployeeP(String name,String sex,String date, String phoneNo, String address,int salary,int overtimeHours){
		this.name=name;
		this.sex=sex;
		this.date=date;
		this.phoneNo=phoneNo;
		this.address=address;
		this.salary=salary;
		this.overtimeHours=overtimeHours;
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	public double overtimePay() {
		
		return salary*overtimeHours*1.5/240;
		}
	
	public	void printData() {
		System.out.println("\n"+"Employee name: \t"+ name);
		System.out.println("Sex: \t"+ sex);
		System.out.println("OnBoard date: \t"+ date);
		System.out.println("Phone no: \t"+ phoneNo);
		System.out.println("Address: \t"+ address);
		System.out.println("Salary: \t"+ salary);
	}
	
		
}
