package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Ex250423 {
	public static void main(String[] args) {
		//map을 이용한 문자의 빈도 계산
		//{a:5, b: 4, c : 3, d:5}
		String str = "aaaaabbbbcccddddd";
		Map<String, Integer> map = new HashMap<>();		
		String[] strs = str.split("");
		for(String s : strs) { //조회는 항상FOr문
			Integer i =  map.get(s);//null 줄 값이 없으면..
			if( i == null) {
				map.put(s, 1);
			}
			else {
				map.put(s, i+1);
			}
		}
		System.out.println(map);
	}
}
