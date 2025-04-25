package student;

import java.util.Comparator;



//접근제한자랑 모든 메서드 필드 생성자
public class Student {
	//클래스 내에 선언할 위치
	//1. 필드
	//2.생성지
	// 3.getter / setter
	private int no;
	String name;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {}
		
		public Student(int no, String name) {
			this.no = no;
			this.name = name;
		}
	
		public Student(int no, String name, int kor, int eng, int mat) {
			this(no, name);
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
		
		// no, name, kor, eng, mat
		
		public int  getNo() {
			return no;
		}
		public String getName() {
			return name; 
		}
		public int getKor() { 
			return kor; 
		}
		public int getEng() { 
			return eng; 
		}
		public int getMat() { 
			return mat; 
		}
		
		public void setKor(int kor) { 
			this.kor = kor; 
			}
		public void setEng(int eng) { 
			this.eng = eng; 
			}
		public void setMat(int mat) { 
			this.mat = mat;
			}
		public void setName(String name) { 
			this.name = name; 
			}
		
	
		public int total() {
			return kor+eng+mat;
		}
	
		public double avg() {
			return total() / 3d;
		}
	
	public String toString() {
		return String.format("%5d %5s %5d %5d %5d %6.2f %5d", no, name, kor, eng, mat, avg(), total());
		}
	
	public int compareTo(Student o) {
		
		return name.compareTo(o.name);
		
	}
	
	public static Builder builder() {
		return new Builder();
		
	}
	 static class Builder{
		private int no;
		private String name;
		private int kor;
		private int eng;
		private int mat;
		
		Builder no (int no) {
			this.no = no;
			return this;
		}
		Builder name(String name) {
	//		this.name = builder.name;
			return this;
		}
		Builder kor(int kor) {
	//		this.kor = builder.kor;
			return this;
		}
		Student build() {
			return new Student(this);	
		}	
	}
	
	private Student(Builder builder) {
		this.no = builder.no;
		this.name = builder.name;
		this.kor = builder.kor;
		this.eng = builder.eng;
		this.mat = builder.mat;
	}
	
	
	public static void main(String[] args) {
		Student student = Student.builder().no(1).name("새똥이").kor(90).build();// 자기값을 반환시킴
	}
	
}

//⭐️ Getter, Setter 추가?
	
	
//뒷부분 따로 있음

//package student;
//
////Data class
//
//
//public class Student {
//	//0418 과제 1. 모든 필드 .메서드 생성자 > 접근제한자 함
//	// 2. 어떤 값을 입력하더라도 예외 처리(프로그램 종료는 정상 종료)
//	//3. 점수값 입력의 범위 0~100 사이만 인정
//	//4. 이름 입력은 한글만 인정, 2글자~4글자 사이 -예외 조건문 다 상관없
//	//5. 임시데이터의 점수값을 랜덤으로 배정해서 시작(60~100)
//	//6. circle 관련 예제 레슨 8챕터 도형의 연습 , 다향성
//	
//	
//	Student(){} // 1번 기본 생성자먼저 작성
//		
//	int no; // 학번
//	String name;
//	int kor;
//	int eng;
//	int mat;
//	int total;
//	
//	
//	 Student(int no, String name) {
//		 
//	    	this.no= no;
//	    	this.name = name;
//	    	
//	  }
//	 
//	 Student (int no, String name, int kor, int eng ,int mat) { 
//		this.no= no;
//	    this.name = name;
//	    this.kor = kor;
//	    this.eng = eng;
//	    this.mat = mat;
//		  
//	 }	 
//	 int total () {
//		 return kor+eng+mat;
//	 }
//    
//	 double avg() {
//		 return (total()/ 3d );
//	 }
//	 
//	 public String toString () {
//		 return String.format("%d %s %d %d %d %f %d",no, name,kor,eng,mat);
//	 }
//}