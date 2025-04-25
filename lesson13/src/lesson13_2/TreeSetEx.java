package lesson13_2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("새똥이");
		set.add("말똥이");
		set.add("개똥이");
		set.add("1");
		set.add("2");
		set.add("9");
		set.add("10");
		
		System.out.println(set); // 사전순 정리 타입이 문자열이라서\\
		
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(9);
		set2.add(10);
		System.out.println(set2); //수치값을 기준으로 해서 //타입의 정렬규칙을 따라간다
		
		// 정렬 기준은 비교 인터페이스가 필요함
		Set<Addr> set3 = new TreeSet<>();
		set3.add(new Addr("개똥이", "1234"));
		set3.add(new Addr("새똥이", "1234"));
		System.out.println(set3);
	}

}
