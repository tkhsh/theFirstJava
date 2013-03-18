public class Sample6_10 {
	public static void main(String[] args) {
		char week = '火';

		switch (week) {
		case '月':
		case '火':
		case '水':
		case '木':
		case '金':
			System.out.println("会社で仕事です");
			break;
		case '土':
		case '日':
			System.out.println("休日です");
			break;
		default:
			System.out.println("曜日の指定を間違えています");
			break;
		}
	}
}
