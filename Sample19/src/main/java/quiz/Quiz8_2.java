package quiz;
public class Quiz8_2 {
	public static void main(String[] args) {
		int i = 1;
		while (true) {
			int j = 1;
			while (true) {
				System.out.print(i * j + "\t");
				j++;
				if (9 < j) {
					break;
				}
			}
			i++;
			if (9 < i) {
				break;
			}
			System.out.println();
		}
	}
}
