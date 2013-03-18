package sample.sample10;
public class Sample10_7 {
	public static int メソッド() {
		System.out.println("メソッド()が呼ばれました");
		return 0;
	}

	public static int メソッド(int i) {
		System.out.println("メソッド(int i)が呼ばれました");
		return i;
	}

	public static int メソッド(int i, int j) {
		System.out.println("メソッド(int i, int j)が呼ばれました");
		return i;
	}

	public static double メソッド(short s) {
		System.out.println("メソッド(short s)が呼ばれました");
		return s;
	}

	public static int メソッド(double d) {
		System.out.println("メソッド(double d)が呼ばれました");
		return (int) d;
	}
}
