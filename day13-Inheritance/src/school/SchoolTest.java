package school;

/**
 * 학교 시스템을 테스트하는 클래스
 * --------------------------------
 * Person 과 상속관계인
 * Student, Employee, Teacher 를 
 * 테스트하는 클래스이다.
 * 
 * @author Administrator
 */
public class SchoolTest {

	public static void main(String[] args) {
		// 1. 선언
		// Person 배열타입의 변수 persons 를 선언
		Person[] persons;
		
		// 2. 초기화
		// (1) persons 를 3 사이즈로 생성
		persons= new Person[3];
		
		// (2) persnos 배열의 각각 0 ~2 인덱스에 
		// [0] : Student  : id=S01, name=홍길동, age=18, major=도술
		// [1] : Teacher  : id=T01, name=정약용, age=32, subject=실학
		// [2] : Employee : id=E01, name=허균,   age=48, dept=문학예술지원
		
		persons[0] = new Student("S01", "홍길동", 18, "도술");
		persons[1] = new Teacher("T01", "정약용", 25, "실학");
		persons[2] = new Employee("E01", "허균", 48, "문학예술 지원");
		
		// 배열의 초기화 리스트를 사용
		Person[] people = { new Student("S01", "홍길동", 18, "도술");
		 				  , new Teacher("T01", "정약용", 25, "실학");
		 				  , new Employee("E01", "허균", 48, "문학예술 지원");
		}
		
		// 3. 사용
		// foreach를 사용하여 persons 배열의 각 엘리먼트에 대하여
		// print() 메소드 호출
		for (Person person: persons) {
			// 가상 메소드 호출(virtual method invocation)
			// 상위클래스에 정의된 메소드를 호출해도
			// 실제 인스턴스 타입의 하위클래스에 재정의 된
			// 메소드가 응답하는것
			// 가상 메소드 호출이 되기 위해서는
			// 반드시 상속이 전제되어야 함
			person.print();
		
	}
	}

}
