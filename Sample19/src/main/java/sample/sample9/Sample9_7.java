package sample.sample9;
public class Sample9_7 {
	public static void main(String[] args) {
		char[] chars = { 'J', 'a', 'v', 'a' };

		if (chars.length != 4) {
			return;
		}
		if (chars[0] != 'J') {
			return;
		}
		if (chars[1] != 'a') {
			return;
		}
		if (chars[2] != 'v') {
			return;
		}
		if (chars[3] != 'a') {
			return;
		}
		System.out.println("charsの中身はJavaでした");
	}
}
