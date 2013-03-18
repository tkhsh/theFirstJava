package sample.sample15;

public class Cat implements Animal {
	public void 鳴く() {
		System.out.println("ニャー");
	}

	public String getName() {
		return "猫";
	}

	public void 食べる(Food 食べ物) {
		if (食べ物 instanceof FoodForCat) {
			System.out.println(食べ物.getName() + "を食べました");
		} else {
			System.out.println(食べ物.getName() + "は食べられません");
		}
	}
}
