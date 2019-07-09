package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문 사용하여 다음의 기준으로
 * 학점을 계산하는 클래스
 * --------------------------------------------
 * A : 90점 이상
 * B : 80 ~ 89 점 사이
 * C : 60 ~ 79점 사이
 * D : 40 ~ 59 점 사이
 * F : 이하 나머지
 * ---------------------------------------------
 * @author Administrator
 *
 */
public class Grade {

	public static void main(String[] args) {
		// 1. 선언
		int score;
		char grade;
		
		// 2. 초기화
		Scanner scan = new Scanner(System.in);
		System.out.println("0~100사이의 정수를 입력:");
		score = scan.nextInt();
		
		// 3. 사용
		if (score >= 90) {
			grade = 'A';
		}else if (score <= 89 && score >= 80){ 
			grade = 'B';
		}else if (score <= 79 && score >= 60){ 
			grade = 'C';
		}else if (score <= 59 && score >= 40){ 
			grade = 'D';
		}else { 
			grade = 'F';
		}
		
	
		// 출력
		System.out.printf("%d점에 해당하는 학점은 %s%n 입니다.",score, grade);
				
		
	}

}
