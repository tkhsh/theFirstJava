package sample.sample12;

import static sample.sample12.Cookie.*;

public class Sample12_6 {
	public static void main(String[] args) {
		Cookie クッキー1 = new Cookie("バター");
		System.out.println(クッキー1.toString());
		System.out.println("クッキーは全部で" + 全体の個数() + "個あります ");

		Cookie クッキー2 = new Cookie("チョコチップ");
		System.out.println(クッキー2.toString());
		System.out.println("クッキーは全部で" + 全体の個数() + "個あります ");

		Cookie クッキー3 = new Cookie("ココア");
		System.out.println(クッキー3.toString());
		System.out.println("クッキーは全部で" + 全体の個数() + "個あります ");
	}
}
