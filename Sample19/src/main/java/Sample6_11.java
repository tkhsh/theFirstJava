public class Sample6_11 {
	public static void main(String[] args) {
		boolean isMale = false;
		System.out.println((isMale ? "男性" : "女性") + "ですね");

		int currentMonth = 4;
		int birthMonth = 4;
		String message = birthMonth == currentMonth ? "今月誕生日ですね" : "もうすぐ誕生日ですね";
		System.out.println(message);
	}
}
