public class Sample6_4 {
	public static void main(String[] args) {
		int probabilityOfRain = 20;

		boolean hasUmbrella = (30 <= probabilityOfRain);
		if (hasUmbrella) {
			System.out.println("傘を持っていく");
		}

		if (!hasUmbrella) {
			System.out.println("傘を持っていかない");
		}
	}
}
