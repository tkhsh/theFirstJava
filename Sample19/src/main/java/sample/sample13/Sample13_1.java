package sample.sample13;

public class Sample13_1 {
	public static void main(String[] args) {
		CreditCard クレジットカード = new CreditCard();
		System.out.println(クレジットカード.toString());

		GoldCard ゴールドカード = new GoldCard();
		System.out.println(ゴールドカード.toString());

		ゴールドカード.ランクを上げる();
		System.out.println(ゴールドカード.toString());
	}
}
