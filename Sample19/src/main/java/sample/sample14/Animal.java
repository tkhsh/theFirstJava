package sample.sample14;

public abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public void 食べる(Food 食べ物) {
		if (食べられる(食べ物)) {
			System.out.println(食べ物.getName() + "を食べました");
		} else {
			System.out.println(食べ物.getName() + "は食べられません");
		}
	}

	protected abstract boolean 食べられる(Food 食べ物);

	public abstract void 鳴く();

	public String getName() {
		return name;
	}

}
