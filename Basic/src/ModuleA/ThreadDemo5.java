package ModuleA;

public class ThreadDemo5 {  // "nested calss" practice
	public ThreadDemo5(String name) { // constructor to get parameter and execute myThread
		new myThread(name).start();
		
	}
	private class myThread extends Thread{
		public myThread(String name) {
			super(name);
		}
	
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println(getName()+":Number "+i);
			}
			}
	}
	public static void main(String[] args) {
		 new ThreadDemo5("Thread 1");
		
	
		 new ThreadDemo5("Thread 2");
		
		
	}

}
