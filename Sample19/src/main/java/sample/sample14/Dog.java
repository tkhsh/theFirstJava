package sample.sample14;

public class Dog extends Animal {
	public Dog() {
		super("犬");
	}

	@Override
	protected boolean 食べられる(Food 食べ物) {
		if (食べ物.getName().equals("ドッグフード")) {
			return true;
		}
		if (食べ物.getName().equals("納豆")) {
			return true;
		}
		return false;
	}

	@Override
	public void 鳴く() {
		System.out.println("ワンワン");
	}

	public void 吠える() {
		System.out.println("ワン！ワン！");
	}
}
