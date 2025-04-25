package lesson04;

public class OpEx4 {

	public static void main(String[] args) {
		int a = 10;
		int b= 5;
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		boolean c = a == b;
		System.out.println("c : " +c);

		//boolean d = c == false;
		//System.out.println("d: " + d);
		
		boolean d = !c;
		System.out.println("d: " +d);
		
		//가힣 글자 개수
		
		System.out.println('힣'-'가'+1);
		
		// boolean e
		// a의 값이 양수이면서 20보다 작은지
	
		
		boolean e = a> 0 && a<20;
		// 프로그램 문법에선 변수를 무조건 왼쪽에 A
		
		System.out.println(e = a> 0 && a<20);
		System.out.println(e = a> 0 && a>30);//일부러 틀린거 넣음 
		
	
		//a값이 홀수이거나 5의 배수인지를 e에 저장
		
		e=a%2==1||a%5==0;
	
		System.out.println(e=a%2==1||a%5==0);
		
		
		System.out.println(9&5);
		System.out.println(9|5);
		System.out.println(9^5);
		System.out.println(~0);
		
		
		System.out.println(9<<2);
		System.out.println(9>>2);
		
		System.out.println(-4<<2);
		System.out.println(-4>>2);
		System.out.println(-4>>>2);//알수 없는 값 굉장히 큰 숫자ㅣ
		
		System.out.println(Integer.toBinaryString(-4>>>2));
		
		
		
		
		
		
		
		
		
		
	}
	}
	
	
