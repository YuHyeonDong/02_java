package array.multi;

import java.util.Scanner;

/**
 * 정수를 저장하는 동적 2차배열을 numbers 생성
 * 
 * number 의 사이즈 : 4
 * numbers[0] <== 5
 * numbers[1] <== 3
 * numbers[2] <== 2
 * numbers[3] <== 7
 * 
 * 각각의 사이즈를 Scanner로 입력 받아서 생성
 * 
 * 생성된 배열 안에는 10, 20, ~ 170까지의 숫자를 저장
 * 출력을 해본다.
 * @author Administrator
 *
 */
public class DynamicInputArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] numbers2d;
		int input;
		int value = 0;
		
		System.out.println("2차 배열의 크기를 입력(4):");
		input = scan.nextInt();
		
		numbers2d = new int[input][];
		
		for (int idx = 0; idx < numbers2d.length; idx++) {
			System.out.printf("인덱스[%d} 1차 배열 크기 입력:%n", idx);
//			input = scan.nextInt();
			//스캐너로 입력된 값으로 1차 배열을 생성
			numbers2d[idx] = new int[scan.nextInt()];
			
			//생성된 1차 배열에 값을 저장
			for(int ind = 0; ind < numbers2d[idx].length; ind++){
				numbers2d[idx][ind] = (value += 10);
			}
		}
		
//		for(int num : numbers) {
//			for () {
				
			}
		}
	}
	

}
