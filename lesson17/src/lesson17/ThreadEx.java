package lesson17;

public class ThreadEx {
	public static void main(String[] args) {
		System.out.println("main 시작");
		MyThread myThread1 = new MyThread();
		MyThread myThread2 = new MyThread();
		myThread1.start(); //run만 가져옴 스레들를 하나 더 생성하는거 출력구문을 빨리 해버림// 모든 출력이 끝나야 끝나고 2개 메인하고 마이스레드 사용한거
		myThread2.start(); //스레들를 하나 더 생성하는거 출력구문을 빨리 해버림// 모든 출력이 끝나야 끝나고 2개 메인하고 마이스레드 사용한거
//		myThread.run(); //싱글스레드
		Thread thread = new Thread(new MyRunable());
		Thread thread2 = new Thread(()->{
			for (int i = 0 ; i < 50; i++) {
			System.out.println(i +"::Thread" + Thread.currentThread().getName());
		}
		});	
		

		thread.start();
		thread2.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("main 종료");
	}
	
}

class MyThread extends Thread{
	@Override
	public void run() {
		for (int i = 0 ; i < 50; i++) {
			System.out.println(i +"::Thread" + getName());
		}
	}	
	void test() {
		System.out.println("test");
	}
}
class MyRunable implements Runnable{
	@Override
	public void run() {
		for (int i = 0 ; i < 50; i++) {
			System.out.println(i +"::Thread" + Thread.currentThread().getName());
		}
	}	
}



