package sample.sample7;
public class Sample7_10 {

	public static void main(String[] args) {
		char[] chars = { 'q', 'a', 'w', 's', 'e', 'd', 'r', 'f', 't', 'g', 'y',
				'h', 'u', 'j', 'i', 'k', 'o', 'l', 'p' };

		for (int i = 0; i < chars.length - 1; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[j] < chars[i]) {
					char temporary = chars[i];
					chars[i] = chars[j];
					chars[j] = temporary;
				}
			}
		}

		for (int i = 0; i < chars.length; i++) {
			System.out.println((i + 1) + "番目の文字は「" + chars[i] + "」です");
		}
	}
}
