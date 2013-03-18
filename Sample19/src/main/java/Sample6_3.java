public class Sample6_3 {
	public static void main(String[] args) {
		int probabilityOfRain = 20;

		boolean hasUmbrella = (30 <= probabilityOfRain);
		if (hasUmbrella == true) {
			System.out.println("傘を持っていく");
		}

		if (hasUmbrella == false) {
			System.out.println("傘を持っていかない");
		}
	}
}
