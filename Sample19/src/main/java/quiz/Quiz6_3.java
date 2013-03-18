package quiz;
public class Quiz6_3 {
	public static void main(String[] args) {
		int point = -10;
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

		if (point > 100 || point < 0) {
			System.out.println("点数が不正です");
		} else {
			System.out.println(point + "点なので、成績は" + grade + "です");
		}
	}
}
