package sample.sample8;
public class Sample8_10 {
	public static void main(String[] args) {
		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				System.out.println(hour + "時" + minute + "分");
				if (minute == 5) {
					break;
				}
			}
			if (hour == 2) {
				break;
			}
		}
	}
}
