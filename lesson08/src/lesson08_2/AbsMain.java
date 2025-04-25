package lesson08_2;

public class AbsMain {
	public static void main(String[] args) {
		
	}

}

abstract class Parent{
	abstract void m();
}

abstract class Child extends Parent{
	
}

abstract class GrandChild extends Child {// 있어도 되고 없어도 될 때가 있음
	void m() {
		
	}
}

class GrandGrandChild extends GrandChild {
	
}