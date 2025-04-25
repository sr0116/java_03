package lesson04;

public class OpEx2 {
	public static void main(String[] args) {
		int a = 5+5;
		System.out.println("5+5="+a);
		int b = a-5;
		System.out.println("10-5="+b);
		int c = b*2;
		System.out.println("5*2="+c);
		int d = c/5;
		System.out.println("10/5="+d);
		
		int e = 10%3;
		System.out.println("10%3="+e);
		
		
		
		
		// 산술 연산
		// int 보다 작은 타임블. byte, short, char
		
		char ch1='A';
		ch1=(char)(ch1+1);
		
		
		ch1++;
		System.out.println(ch1);
		
		
		//quiz 소수점 둘째 자리까지 절삭
		// double val= 1.234567; 기반으로 작업했을 때 1.23 , 연산자. 형변환
		
		
		
		double val= 1.234567;
		
		val = val*100; //123.4567
		val = (int)val;
		val=val /100;
		
		System.out.println(val); // 출력을 해야함

		
		
		
		
	}
	
	
}
