package ModuleA;//anonymous class

public class ThreadDemo6 extends Thread {
	public ThreadDemo6(String name) {
		super(name);
	}

	public static void main(String[] args) {
		ThreadDemo6 t1= new ThreadDemo6("Thread 1") { // anonymous class
			public void run() {// method is inserted after new object, if one time method.
				for(int i=0;i<100;i++) {
					System.out.println(getName()+":Number "+i);
				}
			}
		};
		t1.start();
		ThreadDemo6 t2= new ThreadDemo6("Thread 2") {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(getName()+":Number "+i);
				}
		}
		};
		t2.start();

	}

}
