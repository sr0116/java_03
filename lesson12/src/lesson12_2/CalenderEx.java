package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

import static java.lang.System.*;


public class CalenderEx {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar();
		
		Scanner scanner = new Scanner(in);
		
		
		
		out.println(cal1.get(ERA));
		out.println(cal1.get(YEAR));
		out.println(cal1.get(MONTH));
		out.println(cal1.get(DATE));
		out.println(cal1.get(HOUR));
		out.println(cal1.get(MINUTE));
		out.println(cal1.get(SECOND));
		out.println(cal1.get(DAY_OF_WEEK));
		cal1.getActualMaximum(MONTH);
		cal1.getActualMaximum(DATE);
		System.out.println(cal1.getActualMaximum(DATE));
		
		cal1.add(MONTH, -10);
		printCal(cal1);
	}
	
	static void printCal(Calendar cal) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
		// 오늘 날짜
		
		
		
	}
}
