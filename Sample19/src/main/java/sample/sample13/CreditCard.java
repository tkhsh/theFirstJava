package sample.sample13;

public class CreditCard {
	protected int 年会費;

	private String 色;

	public CreditCard() {
		this(0, "赤");
	}

	protected CreditCard(int 年会費, String 色) {
		this.年会費 = 年会費;
		this.色 = 色;
	}

	public String get色() {
		return 色;
	}

	public int get年会費() {
		return 年会費;
	}

	@Override
	public String toString() {
		return "年会費は" + 年会費 + "円、色は" + 色;
	}
}
