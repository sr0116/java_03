package lesson06;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int [6];
		int idx = 0;
		while(true) {//항상 계속 참이 되기에 브레이크 걸어줘야 함
			int number = (int)(Math.random() * 45 +1);
			
			boolean insert = true;
			
			for(int i = 0; i <= idx ; i++) {//배열에 들어간 값이 중복인지 체크하는 반복문
				if(lotto[i] == number) {
					insert = false;
					break;//for브레이크
				}
			}
			
			if(insert) {
				lotto[idx] = number;
				idx ++;
			}
			if(idx == 6) break;//while
		}
		System.out.println(Arrays.toString(lotto));

	}
}
