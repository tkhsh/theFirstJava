package sample.sample9;
public class Sample9_3 {
	private static int[] array1 = { 9, 8, 7, 6, 5 };

	private static int[] array2 = { 1, 2, 3 };

	public static void main(String[] args) {
		printArrays();

		System.out.println("array2をarray1に代入すると");
		array1 = array2;

		printArrays();

		System.out.println("array2の2番目の要素を5にすると");
		array2[1] = 5;

		printArrays();
	}

	public static void printArrays() {
		printArray("array1", array1);
		printArray("array2", array2);
	}

	public static void printArray(String arrayName, int[] array) {
		System.out.println(arrayName + "の要素");
		for (int val : array) {
			System.out.println(val);
		}
	}
}
