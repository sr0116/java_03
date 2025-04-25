package lesson05;

public class Sam {
	public static void main(String[] args) {
		for(int i = 1; i <= 50; i++) {
			int count = 0;//박수를 칠 횟수
			int tmp = i ;
			
			do {
				if(tmp % 10 %3==0 && tmp % 10 != 0) {
					count++;
				}
			}while((tmp/= 10) != 0);
			
			// if(i%3 == 0) count ++;
			
			if(count> 0) {
				for(int j = 0; j <count; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}
			else {
				System.out.println(i);
			}
		}		
	}
}


