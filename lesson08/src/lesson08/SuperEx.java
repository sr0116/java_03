package lesson08;

public class SuperEx {
	
	public static void main(String[] args) {
	
		Child child = new Child();
		child.print();
	}
}// 나중에 고치기


class Parent{
	int number =3;
	
	Parent(){
		super();
		System.out.println("부모 객체 생성");		
	}
}
class Child extends Parent{
	int number =2;
	Child(){
		super();// 딱 한 번만 오고,//본인이나 자신의 생성자를 무조건 하나 불러야 함	
	
		System.out.println("자식 객체 생성");		
	}	
	void print() {
		
		//int number = 1;(number)
		
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}
