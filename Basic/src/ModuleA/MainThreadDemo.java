package ModuleA;

public class MainThreadDemo {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println("before change:  "+t.getName());
		t.setName("MainThread");
		System.out.println("after  change:  "+t.getName());
		

	}

}
