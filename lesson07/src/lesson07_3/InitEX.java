package lesson07_3;

public class InitEX {
	InitEX(){
		System.out.println("생성자");
	}

	static {
		System.out.println("클래스 init 블록");
	}
	{
		System.out.println("인스턴스 init 블록");		
	}
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("main init1 객체");
		new InitEX();
		System.out.println("main init2 객체");
		new InitEX();
		System.gc();// 가비지 컬렉터 /대부분 자동으로 지워져서 임의로 삭제할 때 사용
	}
}
