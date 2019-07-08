
public class BitWise {
/**
 * 비트 연산을 수행하는 연산자를 테스트
 * 
 * &, |, ^ : 비트연산자. 논리 연산이 아님 주의
 * 			 이항 연산자
 * 
 * ~	   : 비트연산자 : 각 비트를 0 -> 1, 1 -> 0 으로 변경
 * 			 단항 연산자
 * 
 * @param args
 */
	public static void main(String[] args) {
		// 1. 변수 선언, 2. 초기화
		int a = 0x1f05;
		int b = 0x31a1;
		
		// 3. printf 로 16진수 바로 출력
		System.out.printf("%x & %x = %x%n", a, b, (a & b));
		System.out.printf("%x | %x = %x%n", a, b, (a | b));
		System.out.printf("%x ^ %x = %x%n", a, b, (a ^ b));
		System.out.printf("~%x = %x%n", a, ~a));
		
	}

}
