package Module5;

public class EmployeeMain {
	
	
	
	
	
	public static void main(String[] args) {
	
		Employee e1 = new Employee();
		System.out.println("Employee count e1  "+Employee.empCount);
		//e1.empno =111;
		e1.setEmpno(111);
		System.out.println("Employee e1 "+e1.getEmpno());
		//e1.name = "Tom";
		e1.setName("Tom");
		System.out.println("Employee count e1 "+Employee.empCount);
		e1.display();
		Employee e2 = new Employee(222,"Employee Mary");
		System.out.println("Employee count e2 "+Employee.empCount);
		e2.display();	
		Permanent p = new Permanent(333,"permanent Stephen",45000);
		p.display();
		sales s = new sales(555,"sales John",3000,2000);
		s.display();
		Temporary t = new Temporary(433,"Temp Sam",150,300);
		t.display();
		
		
		Employee ee= new Permanent(999,"test",4000);
		
		ee.display();
		
		
		//Permanent p = new Permanent(333,"permanent Stephen",45000);
		//Temporary t = new Temporary(433,"Temp Sam",150,300);
		//sales s = new sales(555,"sales John",20000,3000);
		Employee e[]=new Employee[3];
		e[0]= new Permanent(333,"permanent Stephen",45000);
		e[1]= new Temporary(433,"Temp Sam",150,300);
		e[2]= new sales(555,"sales John",20000,30000);
		for (int i=0;i<e.length;i++){
			System.out.println(e[i].paySalary());
			
		}
		e[0].raiseSalary(e[0]);//check
		System.out.println(e[0].paySalary());
		
		for (int i=0;i<e.length;i++){
			System.out.println(e[i].paySalary());
			e[i].raiseSalary(e[i]);//check
			System.out.println(e[i].paySalary());
			
		}
		
		System.out.println("Employee count  "+Employee.empCount);
}
}
