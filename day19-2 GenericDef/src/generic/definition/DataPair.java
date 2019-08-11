package generic.definition;

/** 
 * Generic 사용지점 : 
 * <> 안에 모든 참조형 타입명이 들어갈 수 있음
 * 
 * Generic 정의 시점 :
 * 	<E> : Element : 컬렉션에 저장된 엘리먼트의 타입
 * 	<K> : Key	  : K로 지정된 것이 key 의 역할을 할 때 지정하는 타입
 *  <V> : Value   : V로 지정된 것이 value의 역할을 할때 지정하는 타입
 *  <S> : 
 *  <T> : Type	  : 전체적으로 리턴될 타입을 지정할 때 사용
 *  <N> : Number  : 저장될 타입이 숫자형일 때 자세한 지정을 위해 사용
 * -------------------------------------------------------------------
 * 데이터를 저장할 때 key, value 를 쌍으로 저장하는 클래스
 *   
 * @author Administrator
 *
 */
public class DataPair<K, V> {
	
	/** 데이터 저장시 키의 역할을 하는 멤버변수 선언
	 *  이 때, 변수의 타입이 무엇이든지 될 수 있도록 하려면
	 *  Generic 을 주어야 한다.
	 *  우리는 키로 사용된다는 의미로 K 로 지정 */
	private K key;
	
	/** 데이터 저장시 값의 역할을 하는 멤버변수 선언
	 * 값으로 사용된다는 의미로 타입을 V로 지정*/
	private V value;
	
	// 2. 생성자 선언부 
	// (1) 기본생성자
	public DataPair() {
		
	}
	
	// (2) K, V를 쌍으로 받는 생성자
	public DataPair(K key, V value) {
		this();
		this.key = key;
		this.value = value;
	}
	
	// 3. 메소드 선언부 
	// (1) 접근자 수정자
	public K getKey() {
		return this.key;
	}
	
	public void setKey() {
		this.key = key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setValue() {
		this.value = value;
	}
	
	 
}
