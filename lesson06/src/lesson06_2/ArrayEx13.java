package lesson06_2;

import java.util.Arrays;

public class ArrayEx13 {
	//초기의 배열
	//5개의 int 배열 생성
	public static void main(String[] args) {
		int [] arr = {10,20,30,40,50};
	
		//기종 배열의 두배의 길이를 가지는 배열을 생성
		int [] tmp = new int[arr.length * 2]; // 10 [0,0,0,0......,0,0]
		
		for(int i = 0 ; i< arr.length ; i++) {
			tmp[i] = arr[i];
		}
		// 배열의 참조값 복사
		arr = tmp;          // tmp가 갖고 있는 값을 덮어쓰는 것
		
		System.arraycopy(arr, 1, tmp, 2, 3);
		arr = tmp;
		System.out.println(Arrays.toString(arr));
		
		//for문을 이용한 복사,arraycopy를 이용한 복사는 복사될 대상을 미리 생성
		
		int[] arr2 = Arrays.copyOf(arr, 20);
		System.out.println(Arrays.toString(arr2));
		
		int[] result = {1,2,3};
		result = Arrays.copyOf(result, result.length *2);
		
		System.out.println(Arrays.toString(result));
		
		
	}
}

