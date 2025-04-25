package lesson12_2;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random random = new Random(0);//0이라는 시드를 가지고 있는 //그래서 값이 고정되어 있음//어디서 하는 이 범위가 나옴
		random.nextDouble(); //Math.random();
		
		
		for(int i = 0; i<10;i++) {
			System.out.println(random.nextInt(6)+1);
		}
	}	
}
