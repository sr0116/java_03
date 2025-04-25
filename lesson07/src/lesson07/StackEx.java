package lesson07;

public class StackEx {
	public static void main(String[] args) {
		System.out.println("main start");
		method1();
		System.out.println("main end");
		
	}
	static void method1() {
		System.out.println("method1 start");
		method2();
		System.out.println("method1 end");
		
	}
	static void method2() {
		System.out.println("method2 start");
		method3();
		//method1(); 에러 오버 플로우
		System.out.println("method2 end");
		
	}
	static void method3() {
		System.out.println("method3 start");
		System.out.println("method3 end");		
	}

}
