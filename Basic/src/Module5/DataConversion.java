package Module5;

public class DataConversion {




public static void main(String []args) {
	Permanent p1=new Permanent(333,"permanent Stephen",45000);
	System.out.println(p1.getEmpno()+p1.getName()+p1.getSalary());

	Employee e=p1;//implici. e got same pointer address of p1
	System.out.println(e.getEmpno()+e.getName());//e object derived from clasee Employee,
	//which have no getSalary

	
	Permanent p2=(Permanent)e;//explicit, p2 got pointer address from e, direct to the area
	//of p1
	System.out.println(p2.getEmpno()+p2.getName()+p2.getSalary());//
	
	//Temporary t= (Temporary)e;
	//System.out.println(t.getEmpno()+t.getName());//complie error:The method getSalary() is undefined for 
	 // the type Temporary
	// runtime error:Exception in thread "main" java.lang.ClassCastException: Module5.Permanent cannot be cast to Module5.Temporary
	//at Module5.DataConversion.main(DataConversion.java:21)

}
}