package thread;

public class Mythread extends Thread {

	@Override
	public void run() {
		
		for (int i = 5; i > 0 ; i--) {
			System.out.println("倒數:"+i+","+Thread.currentThread());
			try {
				Thread.sleep(1000);//暫停一秒,1000=1秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("執行結束");
		
	}
	
}
