package control.loop;

/**
 * 구구단을 중첩 for loop 를 사용해서 출력
 * 곱셈의 결과가 50을 넘으면 중단하도록
 * break; 구문과 for 를 조합하여 테스트
 * ---------------------------------------
 * 
 *
 * @author Administrator
 *
 */
public class NineNineBreak {

	public static void main(String[] args) {
		// 1. 선언 2. 초기화, 3. 사용
		
				// 외부 for loop : 단을 결정
				for (int stage = 2; stage <= 9; stage++) {
					
					// 단의 제목 출력
					System.out.printf("%n%d 단%n", stage);
					
					// 내부 for loop : 1 ~ 9 까지 곱해지는 수를 반복
					for (int times = 1; times <=9; times++) {
						if (stage * times > 50) {
							break;
						}
						System.out.printf("%d x %d = %2d%n", stage, times, (stage * times));
						
					}// end inner for
				}// end outer for
				
				OUT : for (int stage = 2; stage <= 9; stage++) {
					
					// 단의 제목 출력
					System.out.printf("%n%d 단%n", stage);
					
					// 내부 for loop : 1 ~ 9 까지 곱해지는 수를 반복
				IN	: for (int times = 1; times <=9; times++) {
						if (stage * times > 50) {
							break;
						}
						System.out.printf("%d x %d = %2d%n", stage, times, (stage * times));
						
					}// end inner for
				}// end outer for
			}// end main

		}// end class
