package generic.definition.getinstance;

/**
 * Generic 사용시점 : 
 *   <> 안에 모든 참조형 타입명이 들어갈 수 있음
 *   
 * Generic 정의 시점 :
 *   <E> : Element : 컬렉션에 저장된 엘리먼트의 타입
 *   <K> : Key     : K로 지정된 것이 key 의 역할을 할 때 지정하는 타입
 *   <V> : Value   : V로 지정된 것이 value 의 역할 을 때 
 *   <S> : 
 *   <T> : Type    : 전체적으로 리턴될 타입을 지정할 때 사용
 *   <N> : Number  : 저장될 타입이 숫자형일 때 자세한 지정을 위해 사용
 * --------------------------------------------------
 * 데이터를 저장할 때 key, value 를 쌍으로 저장하는 클래스
 *  
 * @author 304
 *
 */
public class DataPair<K, V> {
	
	// 1. 변수 선언부
	/** 
	 * 데이터 저장시 키의 역할을 하는 멤버변수 선언
	 * 이 때, 변수의 타입이 무엇이든지 될 수 있도록 하려면
	 * Generic 을 주어야 한다.
	 * 키로 사용된다는 의미로 타입을 K 로 지정 */
	private K key;
	
	/** 데이터 저장시 값의 역할을 하는 멤버변수 선언
	 * 값으로 사용된다는 의미로 타입을 V 로 지정 */
	private V value;
	
	// 2. 생성자 선언부
	// (1) 기본생성자
	private DataPair() {
		
	}

	// (2) K, V 를 쌍으로 받는 생성자
	private DataPair(K key, V value) {
		this();
		this.key = key;
		this.value = value;
	}
	
	// 3. 메소드 선언부
	public K getPairKey() {
		return this.key;
	}
	
	public V getPairValue(K key) {
		return this.value;
	}
	
	// 이 클래스 타입의 인스턴스를 리턴하는
	//     static 메소드 getInstance() 작성
	public static <K, V> DataPair<K, V> getInstance(K key, V value) {
		// getInstance() 메소드 내부에서
		// private 생성자 호출이 일어남
		return new DataPair<>(key, value);
	}
}	