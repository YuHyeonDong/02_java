package clock;

public class GarminActive3 extends SmartWatch {

	@Override
	public void displayTime() {
		System.out.println(getWatchname() + "디스플레이에 시간이 표시됩니다");
	}
}
