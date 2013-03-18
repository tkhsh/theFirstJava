package sample.sample8;

public class Sample8_1 {
	public static void main(String[] args) {
		double[] people = { 170.3, 163.5, 172.7, 182.2, 166.5, 190.8, 156.0 };

		for (double height : people) {
			if (180 <= height) {
				System.out.println("見つかりました！o(^o^)o" + height + "cmでした。");
				break;
			} else {
				System.out.println(height + "cmなので探し続けます。。。");
			}
		}
		System.out.println("終了しました。");
	}
}
