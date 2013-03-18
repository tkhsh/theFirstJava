package sample.sample11;

/**
 * Sample11_4にJavadocコメントを記述した例です。
 * 
 * @version 1.0
 * @author Satsohi Kimura
 */
public class Sample9_4 {

	/**
	 * 長さ30のint型の配列を用意し、その平均値の表示と、各値を表示します。
	 * 
	 * @param args
	 *            この引数は使用していません
	 */
	public static void main(String[] args) {
		int[] points = new int[30];

		initializeArray(points);

		double averagePoint = calculateAverage(points);
		System.out.println("このクラスの平均点は" + averagePoint + "点です");

		printPoints(points);
	}

	public static double calculateAverage(int[] points) {
		double sumPoint = 0;
		for (int point : points) {
			sumPoint = sumPoint + point;
		}
		double averagePoint = sumPoint / points.length;
		return averagePoint;
	}

	private static void printPoints(int[] points) {
		for (int i = 0; i < points.length; i++) {
			System.out.println("出席番号" + (i + 1) + "番は、" + points[i] + "点です");
		}
	}

	/**
	 * 配列の値を初期化します。 サンプルコード用の値を代入しているため、値の意味、規則性はありません。
	 */
	private static void initializeArray(int[] points) {
		// 最初の三件は任意の値を代入する
		points[0] = 90;
		points[1] = 62;
		points[2] = 76;

		// 面倒なので、ループで同じ値を代入する
		for (int i = 3; i < 15; i++) {
			points[i] = 75;
		}
		for (int i = 15; i < 30; i++) {
			points[i] = 70;
		}
	}
}
