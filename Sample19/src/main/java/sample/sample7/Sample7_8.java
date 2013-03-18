package sample.sample7;
public class Sample7_8 {
	public static void main(String[] args) {
		String[] books = { "坊ちゃん", "羅生門", "ガリレオ", "エジソン" };

		System.out.println("私は、本を" + books.length + "冊持っています。");
		System.out.println("たとえば、「" + books[0] + "」です。");
		System.out.println("たとえば、「" + books[1] + "」です。");

		System.out.println();

		books = new String[] { "不思議の国のアリス", "星の王子さま", "くまのプーさん", "シャーロック・ホームズ" };

		System.out.println("私は、本を" + books.length + "冊持っています。");
		System.out.println("たとえば、「" + books[0] + "」です。");
		System.out.println("たとえば、「" + books[1] + "」です。");
	}
}
