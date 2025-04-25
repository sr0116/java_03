package lesson05;

import java.util.Scanner;

public class Ex250410 {
	
	public static void main(String[] args) {
	//[1번문제] 상자갯수 세기
	// 사과를 한 상자당 10개씩 담을 수 있습니다.
	// 사과의 갯수를 123개라고 했을 때 필요한 상자의 갯수를 구하기
	//상자 13개 필요함 (연산자만 사용하기)
	
		
		int save = 10;
		int apples = 123;
		
		
//		int  boxes =  apples/save +1;
		
		
		int boxes = apples/save +(apples%save> 0 ? 1 : 0 );
		
		// int와 같이 숫자나 문자가 나올 수 있게 해야 함, boolean을 사용하지 못하는 이유...만약 뒤의 0?1:0이 없었다면 사용 가능했다.

			System.out.println("필요한 상자의 개수는" + boxes +"개 입니다.");
	
	
	//[2번문제] 합계구하기
	// 1+(-2)+3+(-4)..(-98) + 99+ (-100)_> 1-(-100)
	//반목문 사용하기
	//2500+(-2550)
			int sum = 0;
			for(int i = 1; i <= 100; i++) {
//				sum += - i;
//			}
//			else {
//				sum += i;
//			}
				sum += i %2 == 0 ? -i : i;
				
	}
			System.out.println(sum);
		
		
	
	//[3번문제] 소수판정(prime number)
	//지정된 자연수가 소수(1과 자기자신)인지 아닌지를 출력- 소수 처리할 땐 1은 배제된다
	//숫자 하나 정해놓고 하기
	//약수구하기랑 비슷하고 반복문....
	//}
		int count = 0;
		int num = 13;
		for(int i=2 ; i< num ; i++) {
			System.out.printf(" %d : %d  >> %s\n", i , num % i, num % i == 0? " 약수" : " 약수아님" );
		
		if(num % i == 0) {
		count++;
	}
		
			
	
		    		}
	}
}	    	
		    	
		    
					
			
			
			


