package control.ifstmt;

import java.util.Scanner;

/**
 * weight, height double
 * @author Administrator
 *
 */
public class CalcBMI {

	public static void main(String[] args) {
		// 1. 선언
		double weight;
		double height;
		double bmi;
		String result;
		
		Scanner scan;
		
		// 2. 초기화
		scan = new Scanner(System.in);
		System.out.println("몸무게 키 순으로 입력하세요");
		weight = scan.nextDouble();
		height = scan.nextDouble();
		bmi = weight / (height * height); 
		
		// 3. 사용
		if(bmi < 15.0) {
			result = "병적인 저체중";
		} else if (bmi >= 15 && bmi < 18.5) {
			result = "저체중";
		} else if (bmi >= 18.5 && bmi < 23.0) {
			result = "정상";
		} else if (bmi >= 23.0 && bmi < 27.5) {
			result = "과체중";
		} else if (bmi > 27.5 && bmi <= 40.0) {
			result = "비만";
		} else {
			result ="병적인 비만";
		}
		System.out.printf("%f %s%n 입니다.",bmi, result);
		
			}

}
