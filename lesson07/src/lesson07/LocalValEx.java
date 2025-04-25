package lesson07;

public class LocalValEx {
	
	public static void main(String[] args) {
		
		Local local = new Local();
		
		System.out.println(local.name);
		
		local.process();
		System.out.println(local.name);
		
		local.printAge();
		local.printAge2();
		
		for(int i = 0 ; i< 10; i++) {
			int temp = 0;
			temp += i;
		}
		
		char[] temp = null;
		System.out.println(temp);		
	}
}

class Local {
	

	String name;
	
	void process() {
		String name; //중복 선언이 아님(지역변수 네임을 가르키게 됨)
		name = "홍길동";
	}	
	Void printAge() {
		int age = 20;
		System.out.println(age);
		return null;
	}
	Void printAge2() {
		int age = 30;
		System.out.println(age);
		return null;
	}	
}