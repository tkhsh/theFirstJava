package sample.sample8;
public class Sample8_2 {
	public static void main(String[] args) {
		char[] chars = { 'Q', 'a', 'e', 'D', 't', 'G', 'u', 'j', 'K', 'o', 'l',
				'p', ';', '@', ':' };

		for (char c : chars) {
			if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z')) {
				System.out.println("アルファベット「" + c + "」なので探し続けます。。。");
			} else {
				System.out.println("「" + c + "」が見つかりました");
				break;
			}
		}
		System.out.println("終了しました。");
	}
}
