package lesson06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		//정렬
		//버블 정렬
		
		//{3,4,1,5,2}
		//{3,1,4,5,2}- 한단계씩 비교
		//{3,1,4,5,2}- 한단계씩 비교
		//{3,1,4,2,5}- 한단계씩 비교 -> 이게 1회차 : 5라는 숫자가 위치 확정돼서 자리 이동 이제 안함
                                    	
		//2회차
		
		//{1,3,4,2,5}- 한단계씩 비교	
		//{1,3,4,2,5}- 한단계씩 비교	
		//{1,3,2,4,5}- 한단계씩 비교 - 4,5 확정	

	
		// 3회차
	
		//{1,3,3,4,5}- 한단계씩 비교	
		//{1,2,3,4,5}- 한단계씩 비교 - 전체 확정
		
		
		//이런 스타일을 버블 정렬
		
		//for문이 중복되면 n제곱이라 합
		
		
		int []arr= {3,4,1,5,2};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+1+"회차");
			for(int j = 0 ; j < arr.length-1 - i; j ++) {
				if( arr[j] > arr[j+1]) {
					//앞에 있는게 크면 바꾼다는 식
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;					
				}
				System.out.println(Arrays.toString(arr));
			}
		}
		
	}

}
