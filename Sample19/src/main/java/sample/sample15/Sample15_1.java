package sample.sample15;

public class Sample15_1 {
	public static void main(String[] args) {
		Animal[] 動物たち = new Animal[2];
		動物たち[0] = new Cat();
		動物たち[1] = new Dog();

		for (Animal	 動物 : 動物たち) {
			動物.鳴く();

			if (動物 instanceof Dog) {
				Dog 犬 = (Dog) 動物;
				犬.吠える();
			}
			
			System.out.println("この動物は" + 動物.getName() + "でした\n");
		}
	}
}
