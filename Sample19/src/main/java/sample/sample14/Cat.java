package sample.sample14;

public class Cat extends Animal {

	public Cat() {
		super("猫");
	}

	@Override
	protected boolean 食べられる(Food 食べ物) {
		if (食べ物.getName().equals("魚")) {
			return true;
		}
		if (食べ物.getName().equals("キャットフード")) {
			return true;
		}
		return false;
	}

	@Override
	public void 鳴く() {
		System.out.println("ニャー");
	}

}
