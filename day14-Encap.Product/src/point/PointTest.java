package point;

/**
 * x, y 좌표를 가지고 있는 수학의 점을
 * 테스트하는 클래스
 * @author Administrator
 *
 */
public class PointTest {

	public static void main(String[] args) {
		// 1. 변수 선언
		Point p;
		Point q;
		Point o;
		
		Point[] points = new Point[2];
		
		// 2. 초기화
		p = new Point(0, 0);
		q = new Point(3, 4);
		o = new NamedPoint("0", 0, 0);
		
		points[0] = new Point(0, 0);
		points[1] = new Point(3, 4);
		
		// 3. 사용
		// (1) 점 p 를 출력
		System.out.println(p);
		System.out.println(points[0]);
		
		// (2) 점 q 를 출력
		System.out.println(q);
		System.out.println(points[1]);
		
		// (3) 점 o 를 출력
		System.out.println(o);
		
		// (4) 두 점 사이의 거리를 계산
		System.out.printf("두 점 사이의 거리:%5.2f%n", p.distanceFrom(q));
		
		// (5) 이름이 붙은 원점과 점 q 의 거리 계산
		System.out.printf("원점과 점 q 의 거리:%5.2f%n", o.distanceFrom(q));
	}

}
