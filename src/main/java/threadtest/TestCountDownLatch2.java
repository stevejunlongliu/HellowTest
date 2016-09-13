package threadtest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCountDownLatch2 {
	public static ExecutorService executorService = Executors.newFixedThreadPool(20);
	public static String qq="123";

	
	public static void main(String[] args) throws InterruptedException {
		final CountDownLatch countDownLatch = new CountDownLatch(10);
		
		final List<String> tliqst = new ArrayList<String>();		
		for (int i = 0; i < 10; i++) {
			executorService.submit(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						//System.out.println("1");
						System.out.println(Thread.currentThread().getName());
						Thread.sleep(2000);		
						synchronized (qq) { 												
							tliqst.add(Thread.currentThread().getName());
						} 

					} catch (Exception e) {
						System.out.println(e.getMessage());
					} finally {
						countDownLatch.countDown();
					}
				}
			});

		}
		countDownLatch.await();
		System.out.println(tliqst.size());
		System.out.println("执行完毕");
		executorService.shutdown();
	}
}
