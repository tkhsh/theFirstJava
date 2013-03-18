package sample.sample8;

public class Sample8_7 {
	public static void main(String[] args) {
		int[] a = { 5, 5, 5, 0 };
		int[] b = { 5, 5, 2, 2, 5, 0 };
		int[] c = { 5, 0, 2, 0, 2, 5, 2 };

		int ジャンケンの回数 = 0;
		boolean 同じ手を出していない = true;
		do {
			ジャンケンの回数++;
			if (a[ジャンケンの回数 % a.length] == b[ジャンケンの回数 % b.length]
					&& b[ジャンケンの回数 % b.length] == c[ジャンケンの回数 % c.length]) {
				System.out.println("全員同じ手が出ました");
				同じ手を出していない = false;
			}
		} while (同じ手を出していない);

		System.out.println(ジャンケンの回数 + "回だけジャンケンしました");
	}
}
