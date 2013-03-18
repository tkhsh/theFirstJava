package sample.sample12;

public class Cookie {
	private static int 個数;

	private String 名前;

	static {
		System.out.println("* スタティックイニシャライザが呼ばれました");
		個数 = 0;
	}

	{
		System.out.println("* インスタンスイニシャライザが呼ばれました");
		個数++;
	}

	public Cookie() {
	}

	public Cookie(String 名前) {
		this.名前 = 名前;
		System.out.print(名前 + "クッキーが作られました。");
		System.out.println("(" + 個数 + "個目)");
	}

	public static int 全体の個数() {
		return 個数;
	}

	public String toString() {
		return 名前 + "クッキーです。";
	}

	@Override
	public boolean equals(Object obj) {
		return ((Cookie) obj).名前.equals(this.名前);
	}

	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public Cookie clone() {
		return new Cookie(this.名前);
	}

	@Override
	protected void finalize() {
		Cookie.個数--;
	}
}
