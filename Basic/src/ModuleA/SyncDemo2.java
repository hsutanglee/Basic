package ModuleA;

public class SyncDemo2 implements Runnable {//remove static on SumArray2, so don't need synchronized
	private Thread t;
	private int[] nums;
	 SumArray2 sa=new SumArray2();
	public SyncDemo2(String name, int[]nums) {
		t=new Thread(this,name);
		this.nums=nums;
		t.start();
	}
	public void run() {
		int ans=sa.sumArr(nums);
		System.out.println(t.getName()+":sum="+ans);
	}
	
	
	
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8,9,10};
		new SyncDemo2("Thread 1",nums);
		new SyncDemo2("Thread 2",nums);
	}

}

class SumArray2{
	int sum;
	public  int sumArr(int[] nums) {
		sum=0;
		for (int i=0;i<nums.length;i++) {
			sum+=nums[i];
			System.out.println(Thread.currentThread().getName()+":total = "+sum);
			try {
				Thread.sleep(10);
				
			}catch(InterruptedException e) {}
		}
		return sum;
		
	}
	
}