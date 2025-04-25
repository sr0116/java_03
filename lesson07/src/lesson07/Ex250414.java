package lesson07;

import java.util.Arrays;

public class Ex250414 {
	public static void main(String[] args) {
		//피보나치 수열 출력(반복문)
		// 기본적인 규칙
		//피보나치 수열 숫자 20개 출력
		// 규칙 첫 두자리 숫자의 합이 다음 숫자의 합. 그 다음 숫자는 이전 두 숫자의 합의 연속
		//1  1 2 3 4 8 13 21 44 65 109 ...총 20개
		
		int a = 1;
		int b = 0;
		
		for (int i = 0; i <20; i++) {
		int c = a + b; //2
			System.out.print(" "+c);
			a = b; //1 2
			b = c; //2 3
		}
		//c = a+ b; //3 5
		/*
			1 1 2
			   1 2 3
			   	 2 3 5
		 */
		
		System.out.println("");
		// 50개의 길이를 가지는 정수 배열 생성. 각 값은 1~20 사이의 숫자로 채우기
		// 이후 중복된 값을 제거한 새로운 배열을 생성
		//중복에 관한 숫자가 빠져도 됨
		//로또
		int[] arr = new int [50];
			for(int j = 0; j < arr.length; j++) {
				arr[j] = (int)(Math.random()* 20+1);	
			}
			System.out.println(Arrays.toString(arr));
			
			int[] tmp = new int[20]; 
			System.out.println(Arrays.toString(tmp));
			int length = 0;
//			
//			for(int n : arr) {
//				for(int j = 0; j < tmp.length ; j++) {
//					if(n == tmp[0])
//				}
//			}
			for(int n : arr) {
			boolean insert = true;
				for(int j = 0; j< length; j++) {
					if(n == tmp[j]) {
						insert = false;
						break;
					}
				}
				if(insert) {
					tmp[length++] = n;
				}
			}
			System.out.println(Arrays.toString(tmp));
			tmp= Arrays.copyOf(tmp, length);
			System.out.println(Arrays.toString(tmp));
		
	
			
		
		
		
		// 2차원 배열
		// 특정 패턴을 별로 만들 것이고 
		/*
		 *  **
		 *  **
		 *  **
		 *  *****
		 *  ***** 
		 *       */ 
	 char[][] chs = {
			 {'*','*',' ',' ',' '},
			 {'*','*',' ',' ',' '},
			 {'*','*',' ',' ',' '},
			 {'*','*','*','*','*'},
			 {'*','*','*','*','*'},
	 };
//		 
//		 // 90도 시계 방향 회의 결과를 result에 담으시오
	 char[][] result2 = new char [5][5];
//				 				
	 for(int i = 0; i< chs.length; i++) {
		 for(int j = 0 ; j< chs[i].length ; j++) {
			 System.out.print(chs[i][j]+" ");
			 result2[j][5-1-i] = chs[i][j];
		 }
		 System.out.println();
	 }
	 for(char[]t : result2) {
		 for(char n : t) {
			 System.out.println(n + " ");
		 }
		 System.out.println();
	 }		
	 
		int[][] val = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] result = new int[3][3];
		
		result[0][2] = val[0][0]; //1
		result[1][2] = val[0][1];//2
		result[2][2] = val[0][2];//2
		
		result[0][1] = val[1][0];//4
		result[1][1] = val[1][1];//5
		result[2][1] = val[1][2];//6
		
		result[0][0] = val[2][0];//7
		result[1][0] = val[2][1];//8
		result[2][0] = val[2][2];//9
		
	}
}	
