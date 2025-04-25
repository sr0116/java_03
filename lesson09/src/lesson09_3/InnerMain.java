package lesson09_3;

public class InnerMain {
	public static void main(String[]args) {
		Outer outer = new Outer();
		Outer.Inner i;
		Outer.SInner si;
		i= outer.new Inner();
		si = new Outer.SInner(); //클래스의 속성은 그대로 가져가는 것이며 접근 방법만 다른 것임
																//이름에 대한 충돌을 피하기 위해
	}                                    							// 내부클래스로 숨긴다고 보면 됨
}

class Outer{
	class Inner{
		
	}
	
	static class SInner{// 차이있음
		
	}
	
	void m() {
		class Local{
			
		}
	}
}