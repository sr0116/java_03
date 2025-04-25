package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		String regex = "\\d";
		regex = "[0-9]";
		regex = "\\D"; //숫자 아님
		regex = "[^0-9]";
		Pattern p = Pattern.compile("b[A-Za-z]+"); //첫번째 글자는 무조건 b로 고정,+는 1개 이상인데 b 다음으로 오는 문자가 1개이상,*은 문자 0개 이상, a-z 소문자
		Matcher m;
		String[] strs = { "bat", "cat", "bed","bAt", "Bat", "b0", "0"};
		// 이메일 주소 패턴
		//휴대전화번호 패턴
		
		
		
		for(String s : strs) {
			m = p.matcher(s);
			System.out.println(s+ "=" + m.matches());
		}
		
//		m = p.matcher("bat");
//		System.out.println("bat = " + m.matches());
//		
//		m = p.matcher("cat");
//		System.out.println("cat = " + m.matches());
//		
//		m = p.matcher("bed");
//		System.out.println("bed = " + m.matches());

		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-1010-1111";
		System.out.println("결과"+p1.matches(tel));
		
		System.out.println("abcd1234abcd".replace("a", "e"));//a를 e로 변경
		System.out.println("abcd1234abcd".replaceFirst("a", "e"));
	}
}
