package control.loop;

public class NineNine2 {

	public static void main(String[] args) {
		for (int stage = 2; stage <= 9; stage+= 3) {
			
			System.out.printf("%n%d\t\t%d단\t\t", stage, stage + 1);
			
			for (int times = 1; times <=9; times++) {
				
				System.out.printf("%d x %d = %2d%n", stage, times, (stage * times));
			}
	}

}
}