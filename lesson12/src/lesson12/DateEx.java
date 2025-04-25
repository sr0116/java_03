package lesson12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//오늘 날짜
		// 1970.1.1 >> 70,0,1
		Date today = new Date(125,3,21);
		//수료날짜
		Date enDdate = new Date(125,8,29);
		
		System.out.println(enDdate.getTime() - today.getTime());
		
		long duration = enDdate.getTime() - today.getTime();
		System.out.println(duration / 1000/ 60/ 60 );
	}

}
