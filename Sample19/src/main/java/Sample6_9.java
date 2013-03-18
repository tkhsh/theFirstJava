public class Sample6_9 {
	public static void main(String[] args) {
		char week = '水';

		switch (week) {
		case '日':
			System.out.println("日曜日に市場に出かけ");
			System.out.println("糸と麻を買ってきた");
			break;
		case '月':
			System.out.println("月曜日にお風呂をたいて");
			break;
		case '火':
			System.out.println("火曜日にお風呂に入り");
			break;
		case '水':
			System.out.println("水曜日に友達が来て");
			break;
		case '木':
			System.out.println("木曜日に送っていった");
			break;
		case '金':
			System.out.println("金曜日は糸巻きもせず");
			break;
		case '土':
			System.out.println("土曜日はおしゃべりばかり");
			break;
		default:
			System.out.println("曜日の指定を間違えています");
			break;
		}
	}
}
