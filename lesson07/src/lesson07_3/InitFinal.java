package lesson07_3;

public class InitFinal {
	//초기화 순서 (중요)
	//1.클래스 변수
	//2.클래스 초기화 블럭
	//3. 인스턴스 변수
	//4. 인스턴스 초기화 블럭
	//5. 생성자
	static int si=1;
	int i=2;
	static void sm() {
		System.out.println(si);
		//System.out.println(i);//호출 불가능
	//	System.out.println(this);//호출 불가능
	}
	void m() {//인스턴스
		System.out.println(si);
		System.out.println(i);
		System.out.println(this);
	}
	public static void main(String[] args) {
		InitFinal.sm();
		new InitFinal().m();//인스턴스 존재 유무가 중요함
		
		//static 빠름 대신 한번만 함
	}
}
