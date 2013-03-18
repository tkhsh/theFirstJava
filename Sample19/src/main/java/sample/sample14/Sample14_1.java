package sample.sample14;

public class Sample14_1 {
	public static void main(String[] args) {
		Cat 猫 = new Cat();
		猫.鳴く();
		猫.食べる(new Food("キャットフード"));
		猫.食べる(new Food("ワサビ"));
	}
}
