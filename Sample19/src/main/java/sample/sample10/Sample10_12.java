package sample.sample10;

import static java.util.Arrays.binarySearch;

public class Sample10_12 {
	public static void main(String[] args) {
		int[] array = new int[] { 10, 20, 30, 40, 50 };

		int index = binarySearch(array, 10);
		System.out.println("10は" + index + "番目にありました");

		index = binarySearch(array, 20);
		System.out.println("20は" + index + "番目にありました");

		index = binarySearch(array, 100);
		if (index < 0) {
			System.out.println("100は存在しませんでした");
		} else {
			System.out.println("100は" + index + "番目にありました");
		}
	}
}
