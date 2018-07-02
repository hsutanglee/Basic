package Module5;

public class Employee {
	private int empno;//員工編號
	private String name;//員工姓名
	static int empCount;
	public Employee() {empCount++;}
	
	public Employee(int empno,String name){
	//	System.out.println("constructor with args");
		this.empno = empno;
		this.name = name;
		empCount++;
	}
//	Employee(){System.out.println("constructor with no args");}
	public int getEmpno() {
		return empno;
	}
	public String getName() {
		return name;
	}
	public void setEmpno(int empno){
		this.empno=empno;
	}
	public void setName(String name){
		this.name=name;
	}
	public void display() {
  		
		System.out.println("Emp No="+empno);
		System.out.println("name ="+name);
	}	
	public double paySalary() {
		return 100;
	}
	public void raiseSalary(Employee e) {
		if (e instanceof Permanent) {
			Permanent p=(Permanent)e;
			p.setSalary(p.getSalary()*1.05);
		}
		else if (e instanceof Temporary) {
			Temporary t=(Temporary)e;
			//t.hourPay +=20;
			t.setHourPay(t.getHourPay()+20);
		}
		
	}
	
	
	}


