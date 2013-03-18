package sample.sample10;
public class Sample10_6 {
	public static void main(String[] args) {
		Sample10_5.クラス変数を表示();

		System.out.println("代入前の値 : " + Sample10_5.クラス変数);

		Sample10_5.クラス変数 = Sample10_5.クラス変数 * 5;

		System.out.println("代入後の値 : " + Sample10_5.クラス変数);

		Sample10_5.クラス変数を表示();
	}
}
