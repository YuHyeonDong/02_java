package api.wrapper;

import static java.lang.Integer.*;
import static java.lang.Double.*;

/**
 * 기본형 <==> 참조형 데이터를 
 * 서로 변환할 수 있도록 하는 포장클래스중
 * 
 * int 	  : Integer
 * double : Double
 * 
 * 두 가지 포장클래스를 테스트
 * @author Administrator
 *
 */
public class IntDoubleWrapper {

	public static void main(String[] args) {
		
		
		// 1. 사용할 문자열 변수 선언, 초기화
		String intInput = " 100";
		String dbInput = "200.0";
		
		// 2. String -----> 기본형
		// (1) parseType() : 각 포장클래스의 static 메소드 사용
		String intFrm = String.format("문자열[%s] ==> 기본형[%d]", intInput, Integer.parseInt(intInput));
		
		String dbFrm = String.format("문자열[%s] ==> 기본형[%f]", dbInput, Double.parseDouble(dbInput));
		
		// (2) 변경된 값들 출력
		System.out.println(intFrm);
		System.out.println(dbFrm);
		
		// static import 를 진행하면 클래스 이름 생략
		intFrm = String.format("문자열[%s] ==> 기본형[%d]", intInput, parseInt(intInput));
		
		dbFrm = String.format("문자열[%s] ==> 기본형[%f]", dbInput, parseDouble(dbInput));
		
		//==========================================================================
		// (3) typeValue() 메소드 사용 : non-static 메소드
		//								 인스턴스 생성 후 사용
		intFrm = String.format("문자열[%s] ==> 기본형[%d]", intInput, new Integer(intInput).intValue());
		
		dbFrm = String.format("문자열[%s] ==> 기본형[%f]", dbInput, new double(dbInput).doubleValue());
		
		//==========================================================================
		// 기본형 ------> String
		int ten = 10;
		double sixty = 60.0;
		
		String tenStr = new Integer(ten).toString();
		String sixtyStr = new Double(sixty).toString();
		
		// String 변경 확인을 위하여 String 의 + 연산 시도
		tenStr += "입니다";
		sixtyStr += "입니다.";
		
		//String 변수 출력
		System.out.println(tenStr);
		System.out.println(sixtyStr);
		
		//=========================================================================
		// 4. 기본형 <---------> 참조형
		Integer objTen = new Integer(ten);
		Double objSixty = new Double (sixty);
		
		String tenFrm = String.format("%d 의 참조형 데이터 : %s", ten, objTen.toString());
		String sixtyFrm = String.format("%f 의 참조형 데이터 : %s", sixty, objSixty.toString());
		
		System.out.println(tenFrm);
		System.out.println(sixtyFrm);
		
		System.out.println(ten + "의 참조형 데이터:" + odjTen);
		System.out.println(sixty + "의 참조형 데이터:" + objSixty);
		
		// =========================================================================
		// 5. 포장클래스의 autoUnboxing, autoBoxing
		// autoUnboxing : 참조형 인스턴스가 기본형 변수에
		//				  변환메소드 호출없이 바로 담기는 기법
		// autoBoxing : 기본형 데이터가 참조형 변수에
		//				new 없이 바로 담기는 기법
		
		// (1) autoBoxing 적용 전
		//	   반드시 포장 클래스의 생성자를 사용해야 함
		integer objOne = new Integer(1);
		int one = 1;
		
		// (2) autoBoxing 적용 후
		//	   포장클래스 변수를 마치 기본형 변수인 듯
		// 	   기본형 값 바로 저장을 지원
		Integer objFive = 5;
		
		// (3) autoUnboxing 적용전
		// 	   명시적으로 typeValue() 메소드 호출
		int three = new Integer(3).intvalue();
		
		Integer objFour = new Interger(4);
		int four = objFour.intValue();
		
		// (4) autoUnboxing 적용 후 
		int five = new Integer(5);
		
	}// end method main

}
