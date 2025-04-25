	package lesson05;
	
	import java.util.Scanner;
	
	public class Ex200409 {
		public static void main(String[] args) {
	
	//교과서 03번 
	
	int student = 27;
	int pen = 60;
	
	//System.out.println("학생 당 나누어 줄 수 있는 색연필 수 :" + pen/student);
	//System.out.println("나머지 색연필 수 :" + pen%student);
	System.out.println("학생 당 나누어 줄 수 있는 색연필 수 :" + pen/student+" 나머지 색연필 수 :" + pen%student);

	
	//04번 문제
	
	
	int age=10;  int height= 150;
	boolean parent = false; 
	boolean hearchDease = false;
	boolean isRide = !hearchDease && height >= 120 &&(age >= 6 || parent);
	
	System.out.println(isRide);
	
		
	
	// 05번 문제
	//!= 같지 않다 , == 같다 
	int year = 2020;
	
	boolean leapYear = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);

	// 윤년이면 true, 윤년이 아니면 false
	
	System.out.println(leapYear);
	
	
	
	// 6번
	// 나머지 퍼센트로 계산
	// 나머지로 계산하면 쭉 계산 됨
		
		int price = 187_000; //_언더바를 넣어주면 가독성이 좋아짐
		
		// 정수 연산했을 때 정수가 나오는 특성 이용
		
		int oman = price / 50_000;
		price %= 50_000;
		
		int ilman = price / 10_000;
		price %= 10_000;
		
		int ochun = price / 5_000;
		price %= 5_000;
		
		int ilchun = price / 1000;
		
		System.out.println("5만원권 : " + oman + "장");
		System.out.println("1만원권 : " + ilman + "장");
		System.out.println("5천원권 : " + ochun + "장");
		System.out.println("1천원권 : " + ilchun + "장");


// 07번 100곱하면 0,나누면 지워짐

		 int number1 = 1234;
		 int number2 = 123;
		 int result1= (number1/100)*100;
		 // result1 = number1 -number1 % 100;
		 
		 int result2= (number2/10);
		 
		 System.out.println(result1);
		 System.out.println(result2);			


// 선생님 1번 문제
// 입력문
		 //01. 로그인 인증
		 //사용자로부터 아이디와 비밀번호를 입력받고 
		 // 그 아이디가 admin,비밀번호가 1234일 때 로그인 성공
		 //아이디가 admin 비밀번호를 틀렸을때 로그인 실패> 잘못입력한 비밀번호
		 // 아이디가 admin이 아니면 없는 계정 메세지 출력



			Scanner scanner = new Scanner(System.in);
			String id= "";
			String pw= "";
			System.out.println("아이디를 입력하세요 >");
			id = scanner.nextLine();
			System.out.println("입력한 아이디 : " + id);
			
			System.out.println("비밀번호를 입력하세요 >");
			pw = scanner.nextLine();
			System.out.println("입력한 비밀번호 : " + pw);
			
			//.eqauls() - 같은지 아닌지 
			
			if(!id.equals("admin")) {//없는 계정
				System.out.println("존재하지 않는 계정");
			}
			//있는 계정
			else if (pw.equals("1234"))// 로그인 성겅
			{		System.out.println("로그인성공");
				
			}
			else {
				System.out.println("비밀번호 틀림");
			}

// 2번 4가지 조건인데 입력했을 때 

			int input = scanner.nextInt();
			boolean 삼의배수 = input % 3 == 0;
			boolean 짝수 = input % 2 == 0;
			
			
			if(삼의배수&&짝수) {
			System.out.println("3의 배수이면서 짝수");
			} 
			else if(삼의배수) {
			System.out.println("3의 배수이지만 홀수");
			} 
			else if (짝수) {
			System.out.println("짝수이지만 3의 배수는 아님");
			} 
			else{
			System.out.println("3의 배수도 아니고 짝수도 아님");
			}

// 비트 마스크 플래그
//result = 0;
			result1 = 0;
			result1 += 삼의배수?1:0;
			result1 += 짝수?2:0;
			String str = "";
			

			switch(result1) {  
			
			case 1:
				str+="3의 배수";
			case 2:
				str+="짝수";
			case 3:
				str+="3의 배수 짝수";
			}

// 3번 3~5 봄---> 3이랑 같거나 5보다 적거나 같음 공식대로

			System.out.print("월 입력: ");
			input = scanner.nextInt();
			
			switch (input) {
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
			case 12: case 1: case 2:
				System.out.println("겨울");
				break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}

}
}

//
//
