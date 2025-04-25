package lesson06;

public class Ex250411 {
	public static void main(String[] args) {
		//1번 문제 187000원//배열사용
		//50000,10000,5000,1000 의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		int[] units = { 50000, 10000, 5000, 1000};
		int[] count = new int [units.length];
		//이하 코드 작성 후 갯수 출력
		
		
		
		//2번 문제. 임의의 문자열 생성 ,CAPTCHA 생성
		// 문자열의 범위는 숫자,영대,영소 10글자
		//String 문자열
		
		//3번 문제 . 배열에 임의값 채우기
		
		// 100개의 공간을 가지는 배열(0~9 사이의 아무 값)
		// [0,1,1,1,3,2,1,1,3,2,........]
		
		
		
		// 3-2 .빈도수 구하기
		// 배열의 길이는 10
		
		
		// 교재 연습문제 111p-113p 7문제
		
		
		// 교재 1번 -> 품
		
		int sum = 0;
		for(int i = 0; i <= 100; i+=5) {
			sum += i;
		}
		System.out.println("5의 배수의 합계는 " + sum);
				
		// for 문을 활용하여 반복 합계 연산
		
		
		// 교재 2번
		
		int evenSum = 0;
		int oddSum = 0;
		
		// for문을 활용한 반복 합계 연산
		 for(int i= 1; i<= 100; i++) {
			for(int jac = 1; jac<=100; jac+=2) {
				
				
			}
			 
			
			 
			 // 코드 작성
		 }
		 
		 System.out.println("짝수의 합계는" +evenSum);
		 System.out.println("홀수의 합계는" +oddSum);
		
	}
}