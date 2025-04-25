package lesson01;

public class FloatDouble {
public static void main(String[] args) {
	float myF= 0.12345678901234567890f;
	double myD= 0.12345678901234567890f;
    System.out.println(myF);
    System.out.println(myD);
	
    
//    System.out.println(3.14);
//    System.out.println(1);
//    System.out.println(3.14+1); // 실수 타입을 사용하지 않는 이유는 부정확 해서
	
	float f = 3.141592653589793f;
	double d = 3.141592653589793d;

	
	
	System.out.println("float:"+f);
	System.out.println("double: "+d);
	
	double d2 = 3.14159265389793; //d생략 가능, f는 불가
	System.out.println("double:"+d2);
}
}
