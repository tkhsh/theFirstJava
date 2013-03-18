package quiz;
public class Quiz7_4 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 4; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (array[i] < array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		for (int value : array) {
			System.out.println(value);
		}
	}
}
