package sample.sample15;

public class Sample15_2 {
	public static void main(String[] args) {
		Animal[] 動物たち = new Animal[2];
		動物たち[0] = new Cat();
		動物たち[1] = new Dog();

		for (Animal 動物 : 動物たち) {
			動物.食べる(new DogFood());
			動物.食べる(new CatFood());
			動物.食べる(new Wasabi());

			System.out.println("この動物は" + 動物.getName() + "でした\n");
		}
	}
}
