package thread;

public class TestThread {

	public static void main(String[] args) {
		/* extend Thread
		Mythread t1 = new Mythread();
		t1.setName("倒數執行續");
		t1.start();//開始執行,不會直接呼叫run方法
		*/
		//客戶不允許你使用anonymous class ,TestThread$1.class
		Thread t2 = new Thread(new Runnable() {
			
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
		
		});
		t2.setName("Runnable倒數");
		t2.start();
		System.out.println("Main方法結束");
		
	}

}
