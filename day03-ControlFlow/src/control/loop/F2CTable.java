package control.loop;
/**
 * 화씨온도(F) -> 섭씨온도(c) 변환 공식 c = 5/9(F-32) 를 이용
 * 화씨온도 -> 섭씨온도 변환 표출력
 * 화씨온도 0.0도에서 10도씩 증가시키면서 100.0도 까지 출력
 * for loop 이용, 온도는 double 타입으로 계산
 * 
 * @author Administrator
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		// 1. 선언
		final int FROM = 10;
		final int TO = 100;
		final int STEP = 10;
		
		// 온도 변수 선언
		double fah;
		double cel;
		
		// 변환 테이블 for loop
		for (fah = FROM; fah <= TO; fah += STEP) {
			cel = 5.0 / 9 * (fah - 32);
			System.out.printf("%5.1f F = %5.1f C%n", fah, cel);
		}
	}

}
