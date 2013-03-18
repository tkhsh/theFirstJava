package sample.sample8;
public class Sample8_6 {
	public static void main(String[] args) {

		int index = 0;
		boolean 五未満 = true;

		while (五未満) {
			index++;
			System.out.println(index);

			五未満 = (index < 5);
		}

		System.out.println("終了しました。");
	}
}
