package sample.sample8;
public class Sample8_4 {
	public static void main(String[] args) {
		char[] chars = { ';', 'Q', '1', 'a', 'e', 'D', ':', '5', 't', 'G', '0',
				'u', 'j', 'K', '@', '9', 'o' };

		for (char c : chars) {
			if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
				continue;
			}
			System.out.println("「" + c + "」が見つかりました");
		}
		System.out.println("終了しました。");
	}
}
