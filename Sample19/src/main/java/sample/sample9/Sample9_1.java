package sample.sample9;

public class Sample9_1 {
	private static final int STONE = 0;

	private static final int SCISSORS = 2;

	private static final int PAPER = 5;

	public static void main(String[] args) {
		int[] a = { STONE, PAPER, PAPER, STONE };
		int[] b = { SCISSORS, PAPER, SCISSORS, SCISSORS, PAPER, STONE };
		int[] c = { PAPER, STONE, SCISSORS, STONE, SCISSORS, PAPER, SCISSORS };

		int index = 0;
		boolean 同じ手を出していない = true;
		while (同じ手を出していない) {
			if (a[index % a.length] == b[index % b.length]
					&& b[index % b.length] == c[index % c.length]) {
				同じ手を出していない = false;
			} else {
				index++;
			}
		}
		System.out.println((index + 1) + "回目で全員が同じ手を出しました");
	}
	/*
	 * 修正前 int[] a = { 0, 5, 5, 0 }; int[] b = { 2, 5, 2, 2, 5, 0 }; int[] c = {
	 * 5, 0, 2, 0, 2, 5, 2 };
	 * 
	 * int index = 0; boolean 同じ手を出していない = true; while (同じ手を出していない) { if
	 * (a[index % a.length] == b[index % b.length] && b[index % b.length] ==
	 * c[index % c.length]) { 同じ手を出していない = false; } else { index++; } }
	 * System.out.println((index + 1) + "回目で全員が同じ手を出しました");
	 */
}