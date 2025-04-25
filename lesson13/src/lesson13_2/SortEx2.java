package lesson13_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEx2 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer> (Arrays.asList(10,20,30,10,30,11,2,4,10,20,23,43));
		System.out.println(l);
	
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
			//2개 필요
			
			
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;//음수인지 양수인지만 중요
			}
		};;
		l.sort(comparator);
		System.out.println(l);
		
		l.sort(new Comparator <Integer> () { //단축키 사용

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		System.out.println(l);
		


		
		
		
		//람다식 변경
	
		
		l.sort((Integer o1, Integer o2) -> {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		);
		
		//
	
		l.sort((o1, o2) -> { //리스트에 제네릭을 기반으로 해서 생략 가능
			return o2-o1;
		}
	);
		//완성
		l.sort((o1, o2) -> o2-o1);
		
		
		
		//레드블랙트리 유튜브 검색
//		Arrays.asList(new Integer[] {10,20,30});
//		List<Integer> list = new ArrayList<Integer>();
//		
	}
}
