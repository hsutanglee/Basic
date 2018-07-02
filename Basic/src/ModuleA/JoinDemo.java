package ModuleA;

public class JoinDemo {

	public static void main(String[] args) {
		// Demo Join , thread main wait for nt1, nt2 thread closed
		RunnableDemo nt1= new RunnableDemo("thered1");
		RunnableDemo nt2= new RunnableDemo("thered2");
		System.out.println(nt1.t.getName()+":"+nt1.t.isAlive());
		System.out.println(nt2.t.getName()+":"+nt2.t.isAlive());
		try {
			nt1.t.join();
			nt2.t.join();
		}catch(InterruptedException e) {}
		System.out.println(nt1.t.getName()+":"+nt1.t.isAlive());
		System.out.println(nt2.t.getName()+":"+nt2.t.isAlive());
	}

}
