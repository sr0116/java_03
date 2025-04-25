package lesson09;

public class Complexer implements ComelexerInter {
	
	@Override
	public void send (String tel) {
		System.out.println(FAX_NUMBER + "에서"+ tel+ " FAX로 전송");
	}
	@Override
	public void receive (String tel) {
		System.out.println(FAX_NUMBER + "에서"+ FAX_NUMBER+ "FAX로 수신");
	}
	
	@Override
	public void scan () {
		System.out.println("스캔실행");
	}
	
	@Override
	public void print () {
		System.out.println("출력 실행");
	}	
}
