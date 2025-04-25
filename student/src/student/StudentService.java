
package student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class StudentService {
	private List<Student> students = new ArrayList<>();
	private List<Student> sortedStudents = new ArrayList<>();

	
	// 학생예제의 배열> 리스트로 교체
	//이름 유효성을 정규표현식으로 교체, 배열도 참조자료
	//클론 조건 -> 배열에서 클론이 가능한 이유는 클래스를 기반으로 하기 때문에 , 
	//리스트에선 클론이 안 되는 이유는 리스트가 데이터베이스이기 때문에. 그래서 생성자를 통한 인스턴스 생성
	
	{//카드 예제랑 비슷 add 추가
		
		
		students.add(new Student(1, "개똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student(2, "새똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student(3, "말똥이", randomScore(), randomScore(), randomScore()));
		students.add(new Student(4, "소똥이", randomScore(), randomScore(), randomScore()));
		sortedStudents = new ArrayList<Student>(students);;// addAll추가// 다른 리스트를 추가하는 형태
		rank();//값이 변하면 호출
	}// 초기화블럭 //2025 0423 블로그에 생성자 생성으로 사진 찍어둠 , 그걸 더 추런
	public static StudentService studentService = new StudentService();
	private StudentService () {
		
	}
	public static StudentService getInstance () {
		return studentService;
	}
	
	public int randomScore() {
		return (int)(Math.random() * 41 + 60);
	}

	public Student findBy(int no) {
		for (Student s : students) {
			if (s.getNo() == no) 
				return s;
		}
		return null;//못찾으면 null값
	}

	public int checkRange(String subject, int input, int start, int end) {
		if (input < start || input > end) {
			throw new IllegalArgumentException(subject + " 값은 " + start + "~" + end + " 사이여야 합니다.");
		}
		return input;
	}
	public int checkRange(String subject, int input) {
		return checkRange(subject, input, 0, 100);
	}

	public String inputName() {
		String name = StudentUtils.nextLine("이름 > ");
		if (!name.matches("[가-힣]{2,4}")) {
			throw new IllegalArgumentException("이름은 한글 2~4글자여야 합니다.");
		}
		return name;
	}

	public void register() {
		System.out.println("등록 기능");
		int no = StudentUtils.nextInt("학번 > ");
		if (findBy(no) != null) {
			System.out.println("이미 존재하는 학번입니다.");
			return;
		}
		String name = inputName();
		
		int kor =  StudentUtils.nextInt("국어 > ");
		checkRange("국어",kor);
		int eng =StudentUtils.nextInt("영어 > ");
		checkRange("영어",eng);
		int mat =StudentUtils.nextInt("수학 > ");
		checkRange("수학",mat);
		
		Student s2=new Student(no, name, kor, eng, mat);
		students.add(s2);
		sortedStudents.add(s2);
		rank();
	}
	
//조회
	public void read() {
		System.out.println("조회 기능");
		print(students);
	}

	public void readOrder() {
		System.out.println("석차순 조회 기능");
		print(sortedStudents);
	}

	public void print(List<Student> stu) {
//		for (int i = 0; i< stu.size(); i++) {
//			System.out.println(stu.get(i));
//		}
		stu.forEach(s-> System.out.println(s));//참조
	}
	
	
//수정
	public void modify() {
		System.out.println("수정 기능");
		int no = StudentUtils.nextInt("수정할 학생의 학번 > ");
		Student s = findBy(no);
		if (s == null) {
			System.out.println("해당 학번의 학생이 없습니다.");
			return;
		}
		s.setName(inputName());
		s.setKor(checkRange("국어", StudentUtils.nextInt("국어 > ")));
		s.setEng(checkRange("영어", StudentUtils.nextInt("영어 > ")));
		s.setMat(checkRange("수학", StudentUtils.nextInt("수학 > ")));
		rank();
	}

	//삭제
	
	public void remove() {
		
		System.out.println("삭제 기능");
		int no = StudentUtils.nextInt("삭제할 학번 > ");
		Student s = findBy(no);
		if (s == null) {
			System.out.println("해당 학번의 학생이 없습니다.");
			return;
		}
		students.remove(s); // 학생을 지우는 것 어레이카피는 땡겨 오는 것이고 땡겨 오는 거니까
		sortedStudents.remove(s); 
	// 랭크 지워도 됨 유지가 되니까
	}
//평균(국영수)
	public void allAvg() {
		
		// students.stream().map(s-> s.getKor())연구
		double avgKor = 0;
		double avgEng = 0 ;
		double	avgMat = 0;
		double avgAll = 0;
		int size = students.size();
		
		for (int i = 0; i< size;i++) {
			avgKor += students.get(i).getKor();
			avgEng += students.get(i).getEng();
			avgMat += students.get(i).getMat();
		}
		int count = students.size();
		avgKor /= (double)size;
		avgEng /= (double)size;
		avgMat /= (double)size;
		avgAll = (avgKor + avgEng + avgMat) / 3;
		
		System.out.printf("국어 평균: %.2f\n" + avgKor);
		System.out.printf("영어 평균: %.2f\n"+ avgEng);
		System.out.printf("수학 평균: %.2f\n"+ avgMat);
		System.out.printf("전체 평균: %.2f\n"+ avgAll);
	}

		
	public void rank() { // sort 정 리
		
//			1번 방식
		sortedStudents.sort((s1, s2) -> Integer.compare(s2.total(), s1.total()));
//		
//			//List.sort()
//			
//			sortedStudents.sort(new Comparator<T>() {
//				
//			});
		
//		TreeSet<Object> sortedStudents = new TreeSet<>();
//		
//		Set.of( sortedStudents.size());
//		System.out.println(sortedStudents);
//			
		
		//2. treeset()
		//sortedStudents= new ArrayList<>( new TreeSet<>(sortedStudents));
		
		Collections.sort(sortedStudents,(o1,o2)-> o2.total() - o1.total());
		
		
		}
	}
