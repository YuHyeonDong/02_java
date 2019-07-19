package eraser.one;

/**
 * 칠판 지우개를 정의하는 클래스
 * -------------------------------------------------
 * 칠판 지우개 속성 정의 => 멤버변수로 생성
 * 가로 : width		: double
 * 세로 : height	: double
 * 높이 : depth		: double
 * 겹	: layer		: int
 * 색상	: color		: String
 * ---------------------------------------------------
 * 생성자 정의
 * 기본생성자 명시
 * 매개변수를 받는 생성자 : 모든 필드를 다 받도록 정의
 * ---------------------------------------------------
 * 기능 정의 : 메소드로 생성
 * 칠판지우기   : erase() : void 
 * 				: "칠판을 지웠습니다." 문자열 출력
 * 한 겹씩 제거 : peel() : void
 * 				: 현재 layer 값에서 1 감소
 * 				  layer 가 0이 될 때까지
 * 지우개 상태 출력 : print() : void
 * 					: 현재 지우개의 가로, 세로, 높이, 남은 겹, 색상
 * 					  등의 상태를 출력
 * @author Administrator
 *
 */
public class Eraser {
	
	// 1. 멤버변수 선언부
		double width;
		double height;
		double depth;
		int layer;
		String color;
		
	// 2. 생성자 선언부
	// (1) 기본생성자
	Eraser(){
					
	}
	// (2) 매개변수가 있는 생성자 : 
	//	다섯개의 매개변수를 모두 받는다.
	Eraser(double newWidth, double newHeight, double newDepth
		  , int newLayer, String newColor){
		width = newWidth;
		height = newHeight;
		depth = newDepth;
		layer = newLayer;
		color = newColor;
	}
	// 3. 메소드 선언부
	// (1)erase()
		public void erase() {
			System.out.println("칠판을 지웠습니다.");
		}
	// (2) peel()
		public void peel() {
			// if 를 사용하여 layer 값이
			// 0보다 작아질 수없도록
			// 값을 체크
			if((layer - 1) >= 0) {
				layer--;
//				layer -=1;
			}
		}
		
	// (3) print()
		public void print() {
			System.out.printf("가로:%4.2f, 세로:%4.2f, 높이:%4.2f, 남은겹:%d, 색상:%s", width, height, depth, layer, color);
		}
}
