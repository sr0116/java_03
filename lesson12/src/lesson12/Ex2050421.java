package lesson12;

import java.util.Arrays;

public class Ex2050421 {
	public static void main(String[] args) {}}
		// 1. 위 항목에 맞춰 문자열 자르기}}
		// 프로토콜:// 도메인/파일명 ?(물음표가쿼리스트링.파라미터) 총 4개
		// 2 쿼리스트링은 키1(변수명) = 값 1& 키2 =값2 (현재 6개의 쌍)
		// 즉 값의 쌍은 &로 구분, 키와 값은 = 로 구분
		// where=nexearch&ssc =tab.nx.all&query
		// =%EA%B3%A0%EC%96%91%EC%9D%B4&oquery=%EC%9E%90%EB%B0%94+%EB%A0%88%ED%8D%BC%ED%81%B4%EB%9E%98%EC%8A%A4&tqi=jsUValqX5E0ssaDVHBdssssssMK-431385&ackey=v272m0i1";
		// 쿼리스트링 추출한 이gn에
//// 컨트롤 시프트 에프
//		// 1번 문제
//		
//		String url = "https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ssc=tab.nx.all&query=%EA%B3%A0%EC%96%91%EC%9D%B4&oquery=%EC%9E%90%EB%B0%94+%EB%A0%88%ED%8D%BC%ED%81%B4%EB%9E%98%EC%8A%A4&tqi=jsUValqX5E0ssaDVHBdssssssMK-431385&ackey=v272m0i1";
//		
//		String protocol = url.substring(0, url.indexOf("://"));
//		System.out.println(protocol);
//		url = url.substring(url.indexOf("://"),"://".length());
//	
//		String domain = url.substring(0, url.indexOf("/"));
//		System.out.println(domain);
//		url = url.substring(url.indexOf("/")+"/".length());
//		
//		String fileName = url.substring(0, url.indexOf("?"));
//		System.out.println(fileName);
//		url = url.substring(url.indexOf("?")+"?".length());
//		
//		
//		String queryString = url;
//		System.out.println(queryString);
//	}
//}
//		
//
//	class MyUrl {
//		String protocol;
//		@Override
//		public String toString() {
//			return "MyUrl [protocol=" + protocol + ", domain=" + domain + ", fileName=" + fileName + ", queryString="
//					+ queryString + ", params=" + Arrays.toString(params) + "]";
//		}
//
//
//
//		String domain;
//		String fileName;
//		String queryString;
//		Param[] params;
//		
//	public MyUrl(String url) {
//	
//	protocol = url.substring(0, url.indexOf("://"));
//	url = url.substring(url.indexOf("://")+"://".length());
//	
//	domain= url.substring(0, url.indexOf("/"));
//	url = url.substring(url.indexOf("/")+"/".length());
//	
//	fileName = url.substring(0, url.indexOf("?"));
//	url = url.substring(url.indexOf("?")+"?".length()); 
//	
//	queryString = url;
//	String[]tmps = queryString.split("&");
//	params = new Param[tmps.length]; 
//		for (int i = 0; i<tmps.length; i++) {
//			//System.out.println(tmps[i]);
////		Stto
//			params[i] = new Param(t[0], t[1]);
//		}
//			
//	}
//	//code 자주사용되는 기능> 자동생성
//	
//	
////	
////	class Param {
////		String key;
////		String value;
////		public Param(String key, String value) {
////			this.key = key;
////			this.value = value;
////	
////		}
////		@Override
////		public String toString() {
////			return String.format("Param [key=%s, value=%s]", key, value);
////		}
////	}
////	
//	//
//	//		String[] protocol = url.split("://");
//	//		String protocol2 = protocol[0];
//	//
//	//		String[] domain = protocol[1].split("/");
//	//		String domain2 = domain[0];
//	//
//	//		 String [] fileName = domain[1].split("\\?"); // ?표는 안 되고 s 안되고
//	//		// ? 특수문자는 "\?"
//	//		String fileName2 =fileName[0];
//	////	
//	//
//	//		System.out.println("프로토콜>>" + protocol2);
//	//		System.out.println("도메인>>" + domain2);
//	//		 System.out.println("파일명>>"+ fileName2);
//	//		String query = url.substring(url.indexOf("?") + 1); // ? 위에거 1번 완료
//	//		System.out.println("쿼리스트링>>" + query);
//	//
//	//		// 2번 문제
//	//
//	//		String[] parameter = query.split("&"); // & 구분자로 되면서 지워짐
//	//
//	//		System.out.println(Arrays.toString(parameter));
//	//
//	//		for (int i = 1; i <= 6; i++) {
//	//
//	//			System.out.println(i + "번 쿼리 >>" + parameter[i]);
//	//			// 총 6쌍
//	//			//문자열을 저장했을 때 스플릿 하면 됨
//	//
//	//		}
//	
//		}
//	}
//}
//	