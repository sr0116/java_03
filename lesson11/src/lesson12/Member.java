package lesson12;

public class Member implements Cloneable{
	String name;
	String tel;
	
	Member(String name, String tel) {
		this.name = name;
		this.tel = tel;				
	}
	public String toString() {
		return"name : " + name + ",tel : "+ tel;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof Member // 여기까지가 최소 만족 조건
				&&((Member)obj).tel.equals(tel);
	}
	public Member clone() {
		Member member = null;
		try{
			member = (Member) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}
