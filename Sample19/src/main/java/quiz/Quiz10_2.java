package quiz;
public class Quiz10_2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int value = (int) (StrictMath.random() * 10);
			System.out.println(value);
		}
	}
}
