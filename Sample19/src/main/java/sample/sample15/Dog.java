package sample.sample15;

public class Dog implements Animal {
	public void 鳴く() {
		System.out.println("ワンワン");
	}

	public void 吠える() {
		System.out.println("ワン！ワン！");
	}

	public String getName() {
		return "犬";
	}

	public void 食べる(Food 食べ物) {
		if (食べ物 instanceof FoodForDog) {
			System.out.println(食べ物.getName() + "を食べました");
		} else {
			System.out.println(食べ物.getName() + "は食べられません");
		}
	}
}
