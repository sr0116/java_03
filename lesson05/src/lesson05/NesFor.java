package lesson05;

public class NesFor {
	public static void main(String[] args) {

		// 2중 이상 for문 사용의 대표적 예시
		// 구구단
		// *

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; i < 5; j++) {
//				if(i>= j) {
//				System.out.printf("(%d,%d)", i ,j);
//					}
//				}
//			System.out.println();
//			}
		
		System.out.println("=================================================");
		
		
	// 3 6 9 게임
		// 각 자리의 숫자가 3,6,9,였을때 숫자 언급대신 갯수만큼의 "짝" 글자를 표현
		for(int i = 1; i<=50; i++) {
//			System.out.println("%3d,%3d,%3d\n",i,i % 10, i % 10 % 3 == 0 && i % 10 != 0 ? "짝": "");
		
			int tem = i % 10;
			int count = 0;
			do {
				if (tem  % 3 == 0 && tem != 0) {
					System.out.print("짝");
				}
			else { 
				System.out.print(i);
				}
				tem /= 10;
			}	
			while(tem != 0 );
			System.out.println();
		}
		
		// 최대 공약수 구하기
		
		int gcd = 0;
		
		int a = 12;
		int b = 18;
		
		for(int i = 1; i<= a; i++) {
				for(int j = 1 ; j<= b ; j++) {			
					if(a % i == 0 && b % j == 0 && i == j) {
						System.out.println(j);
						gcd = i;
				}
			} 		
		}
		System.out.println(gcd);
	}
}
		
	