package sample.sample7;
public class Sample7_11 {

	public static void main(String[] args) {
		int[][] points = new int[4][10];

		points[0] = new int[] { 27, 53, 82, 77, 37, 61, 84, 72, 25, 91 };
		points[1] = new int[] { 54, 76, 96, 39, 18, 45, 89, 92, 68, 88 };
		points[2] = new int[] { 54, 69, 81, 57, 49, 67, 76, 81, 67, 89 };

		for (int i = 0; i < points[0].length; i++) {
			points[3][i] = points[0][i] + points[1][i] + points[2][i];
		}

		for (int i = 0; i < points[0].length; i++) {
			System.out.println("出席番号" + (i + 1) + "番の生徒の成績");
			System.out.println("国語 : " + points[0][i]);
			System.out.println("数学 : " + points[1][i]);
			System.out.println("英語 : " + points[2][i]);
			System.out.println("合計 : " + points[3][i]);
			System.out.println("-----");
		}
	}
}
