package sample.sample7;
public class Sample7_6 {
	public static void main(String[] args) {
		double[] 身長 = new double[] { 1.65, 1.74, 1.81, 1.68, 1.56 };
		double[] 体重 = new double[] { 61, 79, 103, 56, 51 };

		for (int i = 0; i < 身長.length; i++) {
			int 社員番号 = i + 1;
			double bmi = 体重[i] / (身長[i] * 身長[i]);
			System.out.println("社員番号が" + 社員番号 + "の社員のBMIは" + bmi + "です");
		}
	}
}
