package sample.sample7;
public class Sample7_9 {

	public static void main(String[] args) {
		int[] agesOfFamily = { 31, 35, 3 };

		for (int i = 0; i < agesOfFamily.length - 1; i++) {
			for (int j = i + 1; j < agesOfFamily.length; j++) {
				if (agesOfFamily[j] < agesOfFamily[i]) {
					int temporary = agesOfFamily[i];
					agesOfFamily[i] = agesOfFamily[j];
					agesOfFamily[j] = temporary;
				}
			}
		}

		for (int i = 0; i < agesOfFamily.length; i++) {
			System.out.println((i + 1) + "番目に若い年齢は" + agesOfFamily[i] + "歳です");
		}
	}
}
