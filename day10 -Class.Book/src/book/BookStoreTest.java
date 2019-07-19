package book;

/**
 * 서점에서 할 수 있는 여러 기능들
 * 책찾기, 책수정, 신간추가, 책 폐기 
 * 등의 기능을 테스트하는 클래스
 * @author Administrator
 *
 */
public class BookStoreTest {

	public static void main(String[] args) {
		
		// 1 .매니저에게 전달할 책장안에 들어갈 배열
		Book[] books = new Book[0];
		
		// 2. 배열로 구성되는 책장을 만든다.
		BookShelf bookShelf = new BookShelf(books);
		
		// 3. 배열로 구성된 책장을 관리할 매니저를 고용
		BookManager manager = new BookManager(bookShelf);
		
		// 4. 책장을 관리하는 매니저와 함께 서점을 오픈
		BookStore kyobo = new BookStore(manager);
		
		//--------------------------------------------------
		// 서점에 신간이 도착
		
		
		
	}

}
