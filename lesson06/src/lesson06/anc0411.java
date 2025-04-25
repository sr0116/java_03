package lesson06;

import java.util.Arrays;

public class anc0411 {
	public static void main(String[] args) {
		//1번 문제 187000원//배열사용
		//50000,10000,5000,1000 의 돈 단위를 이용해, 사용된 지폐의 갯수 계산
		//int[] units = { 50000, 10000, 5000, 1000};
		//int[] count = new int [units.length];
	
		        int money = 187000;
		        int[] units = {50000, 10000, 5000, 1000}; 
		        int[] count = new int[units.length]; 
		        
		        for (int a = 0; a < units.length; a++) {
		            count[a] = money / units[a];   //나누기?   
		            money %= units[a];                
		        }

		        
		        System.out.println("금액: 187,000원");
		        for (int a = 0; a < units.length; a++) {
		            System.out.println(units[a] + "원 지폐: " + count[a] + "장");
		        }
		        //count[0] = monet/ units[0];// 나중에 블로그 ㅗ기
		        
		  
		
		//이하 코드 작성 후 갯수 출력
		
		//2번 문제. 임의의 문자열 생성 ,CAPTCHA 생성
		// 문자열의 범위는 숫자,영대,영소 10글자
		//String 문자열
		        //난수의 범위 0~61
		        //0-9사이 그대로 숫자
		        // 10-35 까지는 영대로 
		        //36 이상은 영소문자로
		        
		  String captcha = "";
		  
		  for (int i = 0; i < 10; i++) {
			  int ch = (int)(Math.random()*62);
			  if(ch<10) { //숫자
				  captcha += ch;
			  }
			  else if(ch<36) {//영대 10 A65
				  captcha += (char)(ch+'A'-10);
			  }
			  else {//영소
				  captcha +=(char)(ch +'a'-36);
			  }
		  }
		  System.out.println(captcha);      
		
						
				
		//3번 문제 . 배열에 임의값 채우기
		
		// 100개의 공간을 가지는 배열(0~9 사이의 아무 값)
		// [0,1,1,1,3,2,1,1,3,2,........]
		
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] counts = new int[10];
		counts[0]++;//첫번째 연산
		counts[1]++;
		//[1,0,0,0,,0,0,1,1,0,1]
		for(int i = 0; i< arr.length ; i++) {
			counts[arr[i]]++;
		}
		System.out.println(Arrays.toString(counts));
		
		// 3-2 .빈도수 구하기
		// 배열의 길이는 10
				
				
		
		
		// 교재 연습문제 111p-113p 7문제
		
		// 교재 1번 문제 - 5의 배수의 합계

		int sum = 0;
		for(int i = 0; i <= 100; i+=5) {
		sum += i;
		}
		System.out.println("5의 배수의 합계는 " + sum);		
		
		int sum1 = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%5 == 0) {
				sum1 += i;
			}
		}
		System.out.println("5의 배수의 합계는 " + sum1);// 이게 베스트	
		
		// 교재 2번
		
		int evenSum = 0;
		int oddSum = 0;
			
		 for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } 
            	else {
            		oddSum += i;
            	}
		 }
		 			System.out.println("짝수의 합계는" + evenSum);
		 			System.out.println("홀수의 합계는" + oddSum);
//	    		
	    		
	    		
	    	// 교재 3번 두개의 주사위의 두 눈의 합이 6이 되는 모든 경우의 수
	    		
	    	for(int x = 1; x<=6; x++) { 
	    		for (int y= 1; y<=6; y++) {
	    			if (x + y == 6) { // 두 눈의 합이 6인지 확인
	    				System.out.println("(" + x + "," + y + ")");
	    			}
	    		}
	   		}			
	    	System.out.println();
	    				
	    					
	    		
	    		// 4번 문제
	    		
    			for(int i= 0; i<5; i++) {    				    			
	    			for (int j= 0; j < 5 ; j++) {
	    				if(j<i) {
	    					System.out.printf("(%d,%d)", i,j);    
	    			} 
	    			else {
	    				System.out.printf("%5c",' ');
	    				}
	    			}
    			}
	    			System.out.println();
	    		
	    		//5번 문제
	    			for(int i= -2; i<3; i++) {    				    			
		    			for (int j= -2; j < 3 ; j++) {
		    				if(i*j<2 && i * j > -2) {
		    					System.out.printf("(%2d,%2d)", i,j);    
		    			} 
		    			else {
		    				System.out.printf("%c",' ');
		    				}
		    			}
		    			System.out.println();
		    			
	    		
	    	// 6번 나중에 다시 보기
	    		
	    			
	    		
	    		//7번 문제
	    		
	    		
	    		int count1 = 0;
	            int dice = 0;

	            while (dice != 6) {
	                dice = (int)(Math.random()* 6+1  ) ;  // 1 ~ 6 사이 숫자?
	                count1++;
	                System.out.printf("(%d)\n", dice);
	            }
	            System.out.println("총 주사위 횟수 : " + count1);
	               // System.out.println("총 주사위 굴린 횟수는 : " + count + "회");
	                
	   	}           
    }
}
				

		
