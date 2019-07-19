package eraser;

/**
 * 칠판 지우개를 정의하는 클래스
 * -------------------------------------------------
 * 지우개 일련 번호 부여를 위한 클래스 변수
 * count 를 선언하고 0으로 초기화
 * -------------------------------------------------
 * 칠판 지우개 속성 정의 => 멤버변수로 생성
 * 
 * 지우개 일련번호 : serial : int
 * 
 * 가로 : width		: double
 * 세로 : height	: double
 * 높이 : depth		: double
 * 겹	: layer		: int
 * 색상	: color		: String
 * ---------------------------------------------------
 * 생성자 정의
 * 기본생성자 명시
 *   : 기본생성자에서
 *     serial 변수에 증가된 count 변수의 값을 저장;
 *     
 * 매개변수를 받는 생성자 :
 * 
 * 생성자 리펙토링(1)
 *             : this 키워드를 사용하여 매개변수 생성자 정의
 * 생성자 리펙토링(2)
 *             : this() 다른 생성자 호출 적용하여
 *             : 생성자를 여려개 중복 정의
 * 
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
	   
	  // TODO 스태틱 변수 int 타입의 count 선언하고 0 초기화 
	  static int count = 0;
	
	  // 1. 맴버변수 선언부
	  // TODO int 타입의 일련번호 저장할 멤버변수 serial 선언
	  int serial;
	  
	  /**지우개 가로 길이 */
	  double width;
	  /**지우개 세로 높이*/
	  double height;
	  /**지우개 높이 길이*/
	  double depth;
	  /**지우개 레이어 겹*/
	  int layer;
	  /**지우개 색깔*/
	  String color;
	  
	  // 2. 생성자 선언부
	  // (1) 기본 생성자
	  /**
	   * 지우개 클래스의 기본 생성자 
	   * 각 맴버 변수플드를 타입의 기본값으로 초기화 진
	   */
	  Eraser(){
		  // TODO 멤버변수인 serial을 
		  // count 클래스변수를 증가시킨
		  // 값으로 저장
		  
	  }
	  
	  Eraser(int serial){
		  this.serial = ++count;
	  }
	  // (2) 매개변수가 있는 생성자 :
	  /**
	   * 지우개의 가로 필드만 초기화 생성자
	   * @param width : 가로 길이 => 직접초기화
	   */
	     Eraser(double width){
	        // 57 줄의 기본 생성자 호출
	        //     : 매개변수가 비어있는 this()이므로
	        this();
	        // width 필드는 매개변수로 넘겨진 값으로 초기화
	        this.width = width;
	     }
	     
	     /**
	      * 지우개의 가로, 세로 필드만 초기화 하는 생성자
	      * @param width : 가로 길이
	      *       => width 필드를 초기화 하는 생성자의 기능을 사용
	      * @param heigth => 세로 길이 => 직접 초기화
	      */
	        Eraser(double width, double height){
	        this(width);
	        this.height = height;
	     }
	  
	        /**
	         * 지우개의 가로, 세로, 높이 필드를 초기화 하는 생성자
	         * @param width : 가로길이 ==> 매개변수 2개 받는 생성자로 초기화
	         * @param height : 세로길이 ==> 매개변수 2개 받는 생성자로 초기화
	         * @param depth : 높이 ==> 직접 초기화
	         */
	     Eraser(double width, double height, double depth){
	        this(width, height);
	        this.depth = depth;
	     }
	     
	        /**
	         * 가로, 세로, 높이, 겹을 초기화 하는 생성자
	         * @param width : 가로길이 ==> 매개변수 3개 받는 생성자로 초기화
	         * @param height : 세로길이 == > 매개변수 3개 받는 생성자로 초기화
	         * @param depth : 높이 ==> 매개변수 3개 받는 생성자로 초기화
	         * @param layer : 직접 초기화
	         */
	    Eraser(double width, double height, double depth, int layer){
	       this(width, height, depth);
	       this.layer = layer;
	    }
	     /**
	      * 가로, 세로, 높이, 겹, 색을 초기화 하는 생성자
	      * @param width : 가로길이 ==> 매개변수 4개 받는 생성자로 초기화
	      * @param height
	      * @param depth
	      * @param layer
	      * @param coler
	      */
	    Eraser(double width, double height, double depth, int layer, String color){
	       this(width, height, depth, layer);
	       this.color = color;
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
			System.out.printf("번호: %d,가로:%4.2f, 세로:%4.2f, 높이:%4.2f, 남은겹:%d, 색상:%s", serial, width, height, depth, layer, color);
		}
}
