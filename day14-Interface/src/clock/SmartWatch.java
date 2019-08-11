package clock;

/**
 * Clock 인터페이스를 구현하여 
 * SmartWatch 를 정의하는 클래스
 * ------------------------------
 * 인터페이스를 구현하면 
 * 구현하는 인터페이스 안에 선언된
 * 추상메소드를 물려받게 된다.
 * 
 * 클레스가 추상메소들르 가지고 있으면
 * 반드시 추상클래스로 선언되어야 한다.
 * 
 * @author Administrator
 *
 */
public abstract class SmartWatch implements Clock {
   /**
    * 스마트 워치 이름 저장하는 변수
    */
   private String watchname;

   // 수정자/ 접근자
   public void setWatchname(String watchname) {
      this.watchname = watchname;
   }
   public String getWatchname() {
      return watchname;
   }
   
   // Clock 인터페이스에서 상속받은 displayTime() 메소드가
   // 구현되지 않았으므로 추상클래스로 작성
   // ==> 인스턴스화 불가능한 추상클래스가 되며
   // ==> 다형성의 타입제공의 의미만 있는 클래스로 한다.
}