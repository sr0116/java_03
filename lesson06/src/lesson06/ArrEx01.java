package lesson06;

import java.util.Arrays;

public class ArrEx01 {
	public static void main(String[] args) {
		int i = 10;
		//배열 (array)
		int[] arr = {10,20,30,50};// 3개의 값을 한꺼번에 저장// new int[]생략
		
		System.out.println(i);
		
		//배열의 값에 접근 하려면 index // 01부터 시작
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		//OS
		
		arr[0] = 60; // {60,20,30,50}
		
		arr[1]=arr[2];
		arr[3] = i; // {60,30,30,10}
		
		//
		
		int[] arr1 = {1,2,3};
		
		int[] arr2 = new int[3];
		// {0,0,0}
		
		int[] arr3 = new int[] {5,6,7,8};
		
		arr1 = new int [] {10,40,50};
		arr1 = new int [10];
		
		// 초기화 방식 기본값이 들어감
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr3));
		
		String[]arr4 = new String[3];
		System.out.println(Arrays.toString(arr4));
		
		char ch = '가';
		ch = 44032;
		ch = '\uAC00';
		ch = 0xac00;
				
		
		
		
	}
}



