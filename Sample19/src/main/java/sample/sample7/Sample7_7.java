package sample.sample7;
public class Sample7_7 {

	public static void main(String[] args) {
		int[] array1 = { 9, 8, 7, 6, 5 };
		int[] array2 = { 1, 2, 3 };

		System.out.println("array1の要素");
		for (int val : array1) {
			System.out.println(val);
		}
		System.out.println("array2の要素");
		for (int val : array2) {
			System.out.println(val);
		}

		System.out.println("array2をarray1に代入すると");
		array1 = array2;

		System.out.println("array1の要素");
		for (int val : array1) {
			System.out.println(val);
		}
		System.out.println("array2の要素");
		for (int val : array2) {
			System.out.println(val);
		}

		System.out.println("array2の2番目の要素を5にすると");
		array2[1] = 5;

		System.out.println("array1の要素");
		for (int val : array1) {
			System.out.println(val);
		}
		System.out.println("array2の要素");
		for (int val : array2) {
			System.out.println(val);
		}
	}
}
