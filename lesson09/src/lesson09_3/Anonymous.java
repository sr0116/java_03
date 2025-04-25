package lesson09_3;

import java.util.Arrays;
import java.util.Comparator;

public class Anonymous {
	public static void main(String[] args) {
		//익명
		//이름이 없어서 생성자가 없음
		//인터페이스를 통한 객체 생성에 자주 사용
		//인스턴스 변수는 생성 가능
		
		Runnable runnable = new Runnable() {
			
			int i;
			static int si = 20;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("실행");
			}
			void m() {
				System.out.println(i);
				
			}
			void m2(int i) {
				System.out.println(i);
				
			}
		};// 클래스인 구간, 런이라는 메서드를 선언했기에, 런이라는 메서드가 추상 메서드로  오버라이드
		runnable.run();
		// System.out.println(runnable.i); 호출 불가
		//runnable.m(); 불가
		Outer outer = new Outer() {
			void m() {
				System.out.println("오버라이드 메서드");
			}
		};
	outer.m();
	
	Integer[]arr = {1,5,3,2,4,1};
	
	Comparator<Integer> iter = new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1-o2;// 뭘 빼냐에 따라 오름차순 내림차순
			}
		};
		
		Arrays.sort(arr,iter);
		
		System.out.println(Arrays.toString(arr));
		
	}
}
