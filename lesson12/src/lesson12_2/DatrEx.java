package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatrEx {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		System.out.println(now.toLocaleString());// 한국 형식의 문자열로 나옴 표준시
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");
		System.out.println(sf.format(now));
	}

}
