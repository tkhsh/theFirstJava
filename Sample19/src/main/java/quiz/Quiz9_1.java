package quiz;
public class Quiz9_1 {

	public static void main(String[] args) {
		int[] points = new int[30];

		initializeArray(points);

		double averagePoint = calculateAverage(points);
		printAveragePoint(averagePoint);

		printPoints(points);
	}

	private static void printAveragePoint(double averagePoint) {
		System.out.println("このクラスの平均点は" + averagePoint + "点です");
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

	private static void initializeArray(int[] points) {
		points[0] = 90;
		points[1] = 62;
		points[2] = 76;
		for (int i = 3; i < 15; i++) {
			points[i] = 75;
		}
		for (int i = 15; i < 30; i++) {
			points[i] = 70;
		}
	}
}
