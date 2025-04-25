package lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWait {
	public static void main(String[] args) {
		Table table = new Table();
		new Thread(new Cooker(table), "요리사").start();
		new Thread(new Customer(table,"햄버거"), "전상현").start();
		new Thread(new Customer(table,"파스타"), "김태훈").start();
		new Thread(new Customer(table, "피자"), "김지유").start();
		
	}
}

class Table{
	List<String> dishNames = new ArrayList<String>(List.of("햄버거","파스타","피자"));
	final int MAX_FOOD = 10;
	
	List<String> dishes = new ArrayList<String>();
	private ReentrantLock lock = new ReentrantLock();
	private Condition forCook = lock.newCondition();
	private Condition forCust = lock.newCondition();
	
	// 테이블 음식 추가
	
	public void add(String dish) {
		lock.lock();
		try{while(dishes.size()>= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name +"이 기다립니다");
			try {
				forCook.await();
				Thread.sleep(500);
			}
			catch(InterruptedException e) {}
		}
		
		dishes.add(dish); // 음식 설계
		forCust.signal();//notufy
		System.out.println("현재 테이블의 음식 ::"+dishes);
		}
		finally {
			lock.unlock();
		}
	}
	//음식 제거
	public void remove(String dish) {
		lock.lock();
		try {
			while(dishes.isEmpty()) {
				String name = Thread.currentThread().getName();
				System.out.println(name +"이 기다립니다");
				try{
					forCust.await();
					Thread.sleep(500);
				}
				catch(Exception e) {}
			}
			while(true) {
				for(int i = 0; i < dishes.size();i++) {
					if(dish.equals(dishes.get(i))) {
						dishes.remove(i);
						forCook.signal();//요리가 잠자면 깨우기
						return;
					}
				}
				String name = Thread.currentThread().getName();
				System.out.println(name +"이 기다립니다");
				try{
					forCust.await();
					Thread.sleep(500);
				}
				catch(Exception e) {}	
			}
		}
		finally {
			lock.unlock();
		}
	}
}
class Customer implements Runnable{
	Table table;
	String food;
	
	public Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
			}
			String name = Thread.currentThread().getName();
			table.remove(food);
			System.out.println(name + "이"+ food +"를 먹었습니다");
		}
	}	
	
}
class Cooker implements Runnable {
	Table table;
	public Cooker(Table table) {
		this.table = table;
	}
	@Override
	public void run() {
		while(true) {
			table.add(table.dishNames.get((int)(Math.random()*3)));
			try {
				Thread.sleep(20);
			} catch(Exception e) {}		
		}
	}
}
