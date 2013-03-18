package sample.sample8;
public class Sample8_5 {
	public static void main(String[] args) {
		int[] a = { 0, 5, 5, 0 };
		int[] b = { 2, 5, 2, 2, 5, 0 };
		int[] c = { 5, 0, 2, 0, 2, 5, 2 };

		int index = 0;
		boolean 同じ手を出していない = true;
		while (同じ手を出していない) {
			if (a[index % a.length] == b[index % b.length] && b[index % b.length] == c[index % c.length]) {
				同じ手を出していない = false;
			} else {
				index++;
			}
		}
		System.out.println((index + 1) + "回目で全員が同じ手を出しました");
	}
}
