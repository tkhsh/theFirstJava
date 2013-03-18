package sample.sample13;

import java.util.Arrays;

public class GoldCard extends CreditCard {

	private String[] 特典;

	public GoldCard() {
		super(1980, "ゴールド");

		this.特典 = new String[] { "旅行傷害保険の補償(100万まで)", "マイルが貯まる" };
	}

	public String[] get特典() {
		return 特典;
	}

	public void ランクを上げる() {
		super.年会費 = 2980;
		this.特典[0] = "旅行傷害保険の補償(1000万まで)";
	}

	@Override
	public String toString() {
		return super.toString() + "、そして特典は" + Arrays.toString(this.get特典());
	}
}
