package lesson05;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {	
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 선택하세요 >");
		Scanner scanner = new Scanner(System.in);
	
		int me = scanner.nextInt();
	//	System.out.println(me);
		
		int com = (int)(Math.random() * 3 +1); 
		// 0이상 1미만의 값> 0이상 3\미만> 1이상 4미만> 정수화
		String[] values = {"가위" ,"바위", "보"};
		System.out.println("내가 낸 것 : "+ values[me-1] + ", 컴퓨터가 낸 것 : "+ values[com-1]);
		
		//System.out.println(com);
		
		//System.out.println(me-com);
	
		int number = me-com;
		
	    switch (number) {
	    case -2 : case 1 :
	    	System.out.println("승리");
	    	break;
	    	
	    case 0 :
	    	System.out.println("무승부");
	    	break;
	    	
	    case -1 : case 2 :
	    	System.out.println("패배");
	    	break;
	    	
	    	default : 
	 
		    	
	    	
	    }
	   
	    
	}

}
