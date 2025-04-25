package lesson17;

public class JoinEx { //나중 수정
	public static void main(String[] args) throws Exception {
		MyJoin join1 = new MyJoin(); 
		MyJoin join2 = new MyJoin ();
		
		join1.start(); 
		join2.start();
		join1.join();
	//	join2.join();
		System.out.println(join1.sum + join2.sum);
		
	}
}

class MyJoin extends Thread{
	int start;
	int end;
	int sum;
	public  void MyJoin(int start, int end, int sum) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i = start; i<=end; i++) {
			sum+=i;
		}
	}
}
