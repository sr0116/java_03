package lesson15;

public class LamdaEx {
	public static void main(String[] args) {
		MyInter inter = i -> i*i;
		
		System.out.println(inter.la(10));
	
		
		
		Object o2 = (MyInter) i -> i*i;
		Runnable runnable = () -> {};
			System.out.println("Runnable");
			
			runnable.run();
	}
}		

@FunctionalInterface//함수형 인터페이스 반드시 하나의 추상 메서드
interface MyInter {
	int la(int i);
}