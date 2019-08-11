package product;

/**
 * 전자제품을 판매하는 매장에서
 * 관리하는 대상인 "제품"을 정의 하는 클래스
 * ------------------------------------------------
 * 멤버변수(private, protected, public을 붙이지 말 것)
 * 제품번호 : pcode    : String : <== "P001"
 * 제품 명  : pname    : String : <== "삼성 지펠..."
 * 가격		: price    : int 	 : 진짜 그 제품 가격
 * 재고수량 : quantity : int
 * ------------------------------------------------
 * 생성자(public 으로 선언)
 * 
 * 기본생성자, 매개변수 받는 생성자 필드 1 씩 늘려가며
 * this, this() 사용
 * ------------------------------------------------
 * 생성자(public 으로 선언)
 *  
 * 메소드 
 * print() : void 
 *  ==> 제품의 상태를 출력
 *   
 * toString() : String
 *  ==> 이제품을 대표하는 문자열을 리턴
 *  ==> String.format() 으로 문자열 생성후 리턴
 *   
 * discount(double percentage) : int
 *  ==> 입력된 퍼센트 만큼 할인된 가격 리턴
 *   
 * sell(int amount) : void
 *  ==> 매장에서 판매(출고)되어
 *  ==> 재고수량(quantity)이 amout 만큼 줄어들도록 반영
 *  ==> 재고수량이 0보다 작아질 수 없도록 제한
 *  ==> 판매하려는 수량(amount)가 재고보다 클 수 없도록 처리
 *   
 * buy(int amount) : void
 *  ==> 매장에 입고되어 재고수량(quantity)이
 *  ==> amount 만큼 늘어나도록 반영
 * 
 * ===========================================================
 * 작성시 주의 할 것.
 * 각 필드를 선언할 때, 필드에 대한 설명을 문서 주석으로 달 것.
 * 각 생성자 선언할 때, 문서 주석 달 것 
 * 각 메소드 선언할 때, 메소드 설명을 문서주석으로 달 것.
 * ---------------------------------------------------------   
 * @author Administrator
 *
 */
public class Product {
	
	// 1. 멤버 변수 선언부
	/** 제품 코드 */
	String pcode;
	/** 제품 명 */
	String pname;
	/** 제품 가격 */
	int price;
	/** 재고 수량 */
	int quantity;
	
	// 2. 생성자 선언부
	/**
	 * 기본 생성자
	 */
	Product() {
		
	}
	
	/**
	 * 제품 코드 필드만 초기화하는 생성자
	 * @param pcode
	 */
	Product(String pcode) {
		this.pcode = pcode;
	}
	
	/**
	 * 모든 필드를 초기화하는 생성자
	 * @param pcode
	 * @param pname
	 * @param price
	 * @param quantity
	 */
	Product(String pcode, String pname, int price, int quantity) {
		this(pcode);
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
	}
	
	// 3. 메소드 선언부
	/**
	 * 제품 정보를 출력
	 */
	public void print() {
		System.out.println(this);
	}
	
	/**
	 * 입력된 percentage만큼 할인을 진행할 경우
	 * 판매 가격이 얼마가 되는지 계산하여 리턴
	 * @param percentage
	 * @return
	 */
	public int discount(double percentage) {
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * percentage);
		}
		
		return price;
	}

	/**
	 * 제품을 출고(판매)하고 재고 수량을 감소시킨다.	 
	 * @param amount
	 */
	public void sell(int amount) {
		// 재고 수량이 출고하려는 수량보다 크거나 같을때만
		// 출고함.
		if (this.quantity >= amount) {
			this.quantity -= amount;
		}
	}
	
	/**
	 * 제품이 입고되어 재고 수량을 증가시킨다.
	 * @param amount
	 */
	public void buy(int amount) {
		// 입고된 만큼 재고수량 증가 후 저장반영
		this.quantity += amount;		
	}

	// Object 클래스에서 나도 모르는 사이 상속받은
	// toString() 메소드를 재정의 해보자.
	// 1. 메소드 헤더가 동일 : 리턴타입 메소드이름 (매개변수 목록)
	@Override
	public String toString() {
		String strProduct = String.format(
				"제품 정보 [제품코드 : %s, 제품명 : %s"
		                 + ", 가격 %,d: , 재고수량 : %d]"
		         , pcode, pname, price, quantity);
		return strProduct;
	}
	
	
	
	
	
	
	
	

}
