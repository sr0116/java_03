package lesson07_3;

public class Access {
	public static void main(String[] args) {
		Target target = new Target();
		System.out.println(target.getI());
	//	target.i = 30; 
		target.setI(30); 
		System.out.println(target.getI());
	}
}

class Target {
	private int i = 20;
	
	public int getI() {
		return i ;		
	}
	
	public void setI(int i) {
		if(i>= 0&& i <= 100) {
			this.i = i;			
		}
	}	
}
