package lesson08;

public class Binding {
	public static void main(String[] args) {
		A obj = new B(); //본질은 인스턴스 B한테 있지만 선언은 조상 타입 A로 선언될 수 있음
		System.out.println(obj);
		System.out.println(obj.si);
		System.out.println(obj.i);
		obj.sm();
		obj.m();
		/////////////////////////////////////////////////////////////
		A a = new A();
		B b = new B();
		
		A c = b; //조상타입으로 선언했기 때문에 가능
//		B d = a;//에러남 
//		B d = (A)a;// 이것도 에러남 ,조상타입을 강제로 자손 타입에 넣을 수 없음 형변환 이슈 (예외상황)
		
		
		//B e = c;
		
		// B e = c; 강제 형 변환 가능
		B e = (B)c;
		System.out.println(e);
	}
}

class A {
	static int si = 1;
	int i = 2;
	static void sm() { System.out.println("A.sm()");}
	void m() { System.out.println("A.m()");}
}
class B extends A {
	static int si = 3;
	int i = 4;
	static void sm() { System.out.println("B.sm()");}
	void m() { System.out.println("B.m()");}
}