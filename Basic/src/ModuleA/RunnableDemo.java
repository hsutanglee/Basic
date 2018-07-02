package ModuleA;// Runnalbe practice from ThreadDemo4

public class RunnableDemo implements Runnable {
	Thread t;
	
	public RunnableDemo(String name) {//constructor to receive parameter name
		t=new Thread(this,name);//Runnable is interface so cannot use super. So use object
		// t, and need to check constructor of Thread to use Thread(Runnable target, String name)
		// and Runnable is not OB, so need to use his son class which is RunnableDemo, so use this here
		t.start();
	}
	
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(t.getName()+":Number "+i);
		}
	}
	
	public static void main(String[] args) {
		 new RunnableDemo("Thread 1");
		
	
		 new RunnableDemo("Thread 2");
		
		
	}

}
