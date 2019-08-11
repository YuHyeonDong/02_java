package api.map;

import static java.lang.Integer.valueOf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * key : Integer 
 * value : Book
 * --------------------------
 * 데이터 입력
 * key : Book 객체의 seq 를 입력
 * value : Book 객체 자체
 * --------------------------
 * 데이터 출력
 * foreach 
 * 	(1) key set 얻기
 *  (2) get(key) 로 추출 => 출력
 *  
 * foreach 
 *  (1) key set 얻기
 *  (2) 각 Book 객체의 가격 10% 할인가로 출력
 * -------------------------- 
 * 
 * @author 304
 *
 */
public class BookMapTest {

	public static void main(String[] args) {
		Book vegetarian = new Book(1, "9788936433598", "채식주의자", "한강", "창비", 247, 10800, 10);

		Book littlePrince = new Book(2, "9791159039690", "어린왕자(초판본)", "생텍쥐페리", "더스토리", 150, 8820, 5);

		Book noDaap = new Book(3, "9791190182645", "제 인생에 답이 없어요", "선바", "위즈덤하우스", 192, 10800, 3);

		Book dduk = new Book(4, "9791196394509", "죽고 싶지만 떡볶이는 먹고 싶어", "백세희", "흔", 208, 12420, 2);

		Book ax = new Book(5, "9788956055466", "책은 도끼다", "박웅현", "북하우스", 348, 14400, 2);
		
		// 1. Map<Integer, Book> 선언
		Map<Integer, Book> books;
		
		// 2. 초기화 HashMap 으로 초기화
		books = new HashMap<>();
		
		// 3. 사용
		// (1) books 맵에 put(Integer, Book)
		// auto-boxing
		books.put(vegetarian.getSequence(), vegetarian);
		books.put(littlePrince.getSequence(), littlePrince);
		
		// new Integer() 로 직접 포장
		books.put(new Integer(noDaap.getSequence()), noDaap);
		
		// Integer 객체로 포장하는 또 다른 방법
		// static 메소드인 valueOf(int) 를 사용함, import static 사용
		books.put(valueOf(dduk.getSequence()), dduk);
		books.put(valueOf(ax.getSequence()), ax);
		
		
		// (2) foreach 로 추출
		//     key 셋을 먼저 얻기
		Set<Integer> keys = books.keySet();
		
		for (int key: keys) {
			System.out.println(books.get(key));
		}
		

		Map<Integer, Book>[] bookMaps = new HashMap[5];		
		List<Map<Integer, Book>> booksList;
		Set<Map<Integer, Map<Integer, List<Integer>>>> booksSet;
	}
}