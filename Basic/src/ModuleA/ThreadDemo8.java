package ModuleA;

public class ThreadDemo8 extends Thread {
	

	public static void main(String[] args) {
	new Thread("Thread 1") {// directly new a obj father
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(getName()+":Number "+i);
				}
			}
		}.start();
	
	new Thread("Thread 2") {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(getName()+":Number "+i);
				}
		}
		}.start();


	}

}
