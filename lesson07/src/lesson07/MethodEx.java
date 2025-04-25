package lesson07;

public class MethodEx {
	
	public static void main(String[] args) {
		int result =add(10, 20);
		System.out.println(result);
		print("Hello");
		System.out.println(addAll(1, 2, 3));
		//addAll(1,2,3);//... 3개는 개수 제한을 없게 함
		//Stack 데이터를 어떻게 나눌 것인가에 대한 기록
		return; //생략 되어 있는 것임
		
	}	
	static int add(int a, int b) {
		return a +b ;
//		return a +b; // 매개 변수._ 종료되는 시점에 사라짐 , 지역과 매개는 똑같음?
	}
	
	static int addAll(int...nums){
		int ret = 0;
		for(int n : nums) {
			ret +=n;
		}
		return ret; //배열 (...은 0개나 여러 개를 제한 없이 가능하게 함)
	}
	
	static void addAll2(){
		return;
	}
	
	
		static void print(String s) {
			System.out.println(s);
		
	}
}
