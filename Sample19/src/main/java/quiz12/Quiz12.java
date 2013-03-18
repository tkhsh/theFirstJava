package quiz12;

public class Quiz12 {
	public static void main(String[] args) {
		Company フジヤマ = new Company("フジヤマ物産");
		フジヤマ.setAddress("東京都港区 XXX-XXX");
		System.out.println(フジヤマ.getName() + "の住所は" + フジヤマ.getAddress() + "です");
	}
}
