package lesson04;

public class special {

	public static void main(String[] args) {
	
		
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println("실행전");
		System.out.println(3/0d);
		System.out.println(0/0d);
		System.out.println("실행후");
		
		
		// && & 차이 1개짜리도 논리연산이 가능한데 왜 2개를 쓰냐고 물어볼 수 있어서
		// 1개짜리는 비트 연산이라 필연적으로 2개 전부 연산해서 그럼
		// 거짓&& 참 (뒤에가 참인지 거짓인지 중요하지 않음 , 이미 거짓이라 뒤에 참을 수행하지 않아서 터지지 않음)
		
		//System.out.println(false & 3/0==1);-> 터짐
		System.out.println(false && 3/0==1);
		
		
		
		
		
		
		
		
		
		
		
		
}
}