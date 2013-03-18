package sample.sample8;
public class Sample8_8 {
	public static void main(String[] args) {

		int index = 0;
		boolean 五未満 = true;

		do {
			index++;
			System.out.println(index);

			五未満 = (index < 5);
		} while (五未満);

		System.out.println("終了しました。");
	}
}
