package lesson12_2;

import java.util.Calendar;
import static java.util.Calendar.*;

import java.text.SimpleDateFormat;


public class MyCalendar {
	public static void main(String[] args) {
		//숫자 <> 문자열
		// 숫자에서 문자열로 가는 것은 format 형식화한다
		//문자열에서 숫자로 가는 것은 parse
		
		//날짜 <> 문자열
		//날짜 >> 문자열 : format 항상 형식화 하는 것은 
		// 문자열 >> 날짜 : parse 이와 동일
		double das = 1e-3;
		
		
		Calendar cal = getInstance();
		cal.set(DATE, 1);
		cal.add(DATE, -1);
		int lastDate = cal.getActualMaximum(DATE);
		int startDate = cal.get(DAY_OF_WEEK);
		System.out.println(startDate-1);
		
		
		int d = startDate-1;
		System.out.println(new SimpleDateFormat("yyyy/MM 달력").format(cal.getTime()));
		
		for(int i = 1 - d ; i <= lastDate;i++) {
			if(i < 1) {
				System.out.printf("%3c", ' ');
			}
			else {
			System.out.printf("%3d", i);
			}
			if (i % 7 ==((7 - d) % 7)) {
				System.out.println();
			} 		
		}
	}
}

