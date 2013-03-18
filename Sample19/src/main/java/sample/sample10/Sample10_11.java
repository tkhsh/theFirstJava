package sample.sample10;

import static java.util.Arrays.*;

import java.util.Arrays;

public class Sample10_11 {
	public static void main(String[] args) {
		int[] array = { 298, 827, 8348, 29, 892, 327, 8, 9, 2, 809, 32 };

		System.out.println("配列の要素を表示します。" + Arrays.toString(array));

		sort(array);

		System.out.println("配列の要素を表示します。" + Arrays.toString(array));
	}
}
