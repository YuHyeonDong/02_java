package clock;

/**
 * Clock인터페이스,
 * SmartWatch, GarminActive3, GalaxyGear4 클래스를 테스트
 * @author Administrator
 *
 */
public class ClockTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// (1) SmartWatch 추상클래스(상위클래스) 타입의 배열 선언
		SmartWatch[] watches = new SmartWatch[2];
		
		// (2) 각 인덱스 위치에 GarminActive3, GalaxyGear4 인스턴스
		watches[0] = new GarminActive3();
		watches[0].setWatchname("가민 액티브3");
		watches[1] = new GalaxyGear4();
		watches[1].setWatchname("갤럭시 기어 4");
		
		// 3. 사용
		for (SmartWatch watch: watches) {
			watch.displayTime();
		}
		
		////////////////////////////////////////////////////////////
		// 4. 인터페이스 타입의 변수선언
		Clock myWatch;
		myWatch = new GarminActive3();
		
		Clock yourWatch;
		yourWatch = new GalaxyGear4();
		
		// 인터페이스타입 배열
		Clock[] clocks = new Clock[2];
		clocks[0] = new GarminActive3();
		clocks[1] = new GalaxyGear4();
		
		// clocks 배열에 있는 시계들로부터 displayTime 호출
		for (Clock clock: clocks) {
			clock.displayTime();
		}
	}

}
