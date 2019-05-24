package esDemo;

public class ThreadDemo01 {
	public static void main(String[] args) {
		//1.怎么调用线程
		CreateThreadDemo01 t1 = new CreateThreadDemo01();
		//2.启动线程，不是调用run方法，而是调用start方法。
		t1.start();
		for (int i = 0; i < 30;i++) {
			System.out.println("main,i:"+i);
		}
		
		CreateThreadDemo02 t2 = new CreateThreadDemo02();
		Thread thread = new Thread(t2);
		thread.start();
		for (int i = 0; i < args.length; i++) {
			System.out.println("主线程");
		}
		
	}
	
}

class CreateThreadDemo01 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("run,i:"+i);
		}
	}
}

class CreateThreadDemo02 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 30;i++) {
			System.out.println("main,i:"+i);
		}
		
	}
	
}
