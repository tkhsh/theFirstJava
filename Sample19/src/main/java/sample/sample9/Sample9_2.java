package sample.sample9;

public class Sample9_2 {

	private static int[] array1s;
	private static int[] array2s;

	public static void main(String[] args) {
		array1s = new int[] { 9, 8, 7, 6, 5 };
		array2s = new int[] { 1, 2, 3 };

		printArrays();

		System.out.println("array2をarray1に代入すると");
		array1s = array2s;

		printArrays();

		System.out.println("array2の2番目の要素を5にすると");
		array2s[1] = 5;

		printArrays();
	}

	private static void printArrays() {
		System.out.println("array1の要素");
		for (int val : array1s) {
			System.out.println(val);
		}
		System.out.println("array2の要素");
		for (int val : array2s) {
			System.out.println(val);
		}
		/*
		 * 　修正前 Sample7_7 int[] array1 = { 9, 8, 7, 6, 5 }; int[] array2 = { 1,
		 * 2, 3 };
		 * 
		 * System.out.println("array1の要素"); for (int val : array1) {
		 * System.out.println(val); } System.out.println("array2の要素"); for (int
		 * val : array2) { System.out.println(val); }
		 * 
		 * System.out.println("array2をarray1に代入すると"); array1 = array2;
		 * 
		 * System.out.println("array1の要素"); for (int val : array1) {
		 * System.out.println(val); } System.out.println("array2の要素"); for (int
		 * val : array2) { System.out.println(val); }
		 * 
		 * System.out.println("array2の2番目の要素を5にすると"); array2[1] = 5;
		 * 
		 * System.out.println("array1の要素"); for (int val : array1) {
		 * System.out.println(val); } System.out.println("array2の要素"); for (int
		 * val : array2) { System.out.println(val); }
		 */
	}
}
