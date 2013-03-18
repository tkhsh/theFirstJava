package quiz;
public class Quiz9_3 {
	public static int 料金を計算する(boolean isMale, int age, boolean isWednesday) {
		if (age <= 3) {
			return 0;
		} else if (age <= 15) {
			return 1000;
		}

		if (isMale == false && isWednesday == true) {
			return 1000;
		}

		if (60 <= age) {
			return 1200;
		}
		return 1800;
	}
}
