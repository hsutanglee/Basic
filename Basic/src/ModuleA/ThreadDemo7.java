package ModuleA;

public class ThreadDemo7 extends Thread {
	public ThreadDemo7(String name) {
		super(name);
	}

	public static void main(String[] args) {
		new ThreadDemo7("Thread 1") {// don't need t1, t2
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(getName()+":Number "+i);
				}
			}
		}.start();
		
		new ThreadDemo7("Thread 2") {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(getName()+":Number "+i);
				}
		}
		};
	

	}

}
