package sample.sample8;
public class Sample8_3 {
	public static void main(String[] args) {
		double rent = 20.0;
		int requiredTime = 5;
		String roomArrangement = "3LDK";

		double[] rents = { 7.5, 10, 21.4, 19.8, 30.0 };
		int[] requiredTimes = { 3, 12, 5, 5, 1 };
		String[] roomArrangements = { "1K", "2LDK", roomArrangement, roomArrangement, roomArrangement };

		for (int i = 0; i < 5; i++) {
			if (rent < rents[i]) {
				System.out.println((i + 1) + "番目の物件は、家賃が高いのでパス。");
				continue;
			}
			if (requiredTime < requiredTimes[i]) {
				System.out.println((i + 1) + "番目の物件は、駅までが遠いのでパス。");
				continue;
			}
			if (roomArrangement != roomArrangements[i]) {
				System.out.println((i + 1) + "番目の物件は、間取りが希望と違うのでパス。");
				continue;
			}

			System.out.println((i + 1) + "番目の物件が候補です。");
		}
	}
}
