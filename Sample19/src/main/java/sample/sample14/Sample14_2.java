package sample.sample14;

public class Sample14_2 {
	public static void main(String[] args) {
		Animal[] 動物たち = new Animal[2];
		動物たち[0] = new Cat();
		動物たち[1] = new Dog();

		for (Animal 動物 : 動物たち) {
			動物.鳴く();
			動物.食べる(new Food("ドッグフード"));
			動物.食べる(new Food("キャットフード"));
			動物.食べる(new Food("ワサビ"));

			System.out.println("この動物は" + 動物.getName() + "でした\n");
		}
	}
}
