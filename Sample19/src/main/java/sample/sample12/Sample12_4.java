package sample.sample12;

import java.util.Arrays;

public class Sample12_4 {
	public static void main(String[] args) {
		int プリミティブ型 = 10;
		int[] 配列型 = { 1, 2, 3, 4, 5 };
		Person 人間型 = new Person("織田信長");

		値を表示する(プリミティブ型, 配列型, 人間型);

		// 値を変更
		プリミティブ型 = 100;
		配列型[0] = 99;
		配列型[1] = 999;
		人間型.set身長(166);
		System.out.println("*** 以下変更後の値 ***");
		値を表示する(プリミティブ型, 配列型, 人間型);

		// 別メソッドで値を変更
		値を変更する(プリミティブ型, 配列型, 人間型);
		System.out.println("*** 以下変更後の値 ***");
		値を表示する(プリミティブ型, 配列型, 人間型);

		// 別メソッドでnullをセットする
		nullをセットする(プリミティブ型, 配列型, 人間型);
		System.out.println("*** nullセット後の値 ***");
		値を表示する(プリミティブ型, 配列型, 人間型);

		// nullをセットする
		配列型 = null;
		人間型 = null;
		System.out.println("*** nullセット後の値 ***");
		値を表示する(プリミティブ型, 配列型, 人間型);

	}

	private static void 値を表示する(int プリミティブ型, int[] 配列型, Person 人間型) {
		System.out.println(プリミティブ型);
		System.out.println(Arrays.toString(配列型));
		if (人間型 != null) {
			System.out.println(人間型.get名前() + " / " + 人間型.get身長());
		}else{
			System.out.println(人間型);
		}
	}

	private static void 値を変更する(int プリミティブ型, int[] 配列型, Person 人間型) {
		プリミティブ型 = 1000;
		配列型[3] = 9999;
		配列型[4] = 99999;
		人間型.set身長(170);
	}

	private static void nullをセットする(int プリミティブ型, int[] 配列型, Person 人間型) {
		配列型 = null;
		人間型 = null;
	}
}
