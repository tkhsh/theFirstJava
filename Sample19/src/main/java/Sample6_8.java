public class Sample6_8 {
	public static void main(String[] args) {
		int point = 102;
		String grade = "";

		if (80 <= point) {
			grade = "A";
		} else if (70 <= point) {
			grade = "B";
		} else if (60 <= point) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.println(point + "点なので、成績は" + grade + "です");
	}
}
