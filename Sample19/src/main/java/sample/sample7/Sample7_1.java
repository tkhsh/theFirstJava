package sample.sample7;
public class Sample7_1 {
	public static void main(String[] args) {
		int[] points;
		points = new int[30];

		points[0] = 90;
		points[1] = 62;
		points[2] = 76;

		System.out.println("出席番号1番は、" + points[0] + "点です");
		System.out.println("出席番号2番は、" + points[1] + "点です");
		System.out.println("出席番号3番は、" + points[2] + "点です");
		System.out.println("出席番号30番は、" + points[29] + "点です");
		System.out.println("このクラスに生徒は" + points.length + "人います");
	}
}
