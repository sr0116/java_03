package lesson06_2;

public class ArrEx10 {
	public static void main(String[] args) {
		int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};// [] 두개면 이차원 배열
		//{1,2,3}이 0번 인덱스
		//숫자 4에 들어가려면 먼저 4번이 있는 1번 인덱스에 가서 0번 인덱스
		
		System.out.println(arr[1][0]); //int 타입-> 이차원에서 인트 타입으로 변경하면서 차원이 낮아짐
		
		String [][][] strs = {
				{},{{"A","B","C"}, {"가","나","다"}},{{"0","1"}}
		};	
		// strs.length 이것만 확실하게 정해두면 됨 안에는 어떤 개수가 와도 상관없음
		//{} 길이값 0개
		//{"A","B","C"}, {"가","나","다"} -> 길이값 2개
		//{{"0","1"}} 길이값 1개
		
		System.out.println(strs.length);
		System.out.println(strs[1].length);//String 이차원 배열 /위와 동일
		System.out.println(strs[1][1].length);
		System.out.println(strs[1][1][1]);
		//배열은 참조 자료 주소값이라 보면 됨
		//이차원 배열은 인트 일차원 배열 명시적으로 알고 있어야 함
	}
}
