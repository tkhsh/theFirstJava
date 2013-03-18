package sample.sample12;

import java.util.Date;

public class staticPerson {
	private static String 名前;

	private static Date 生年月日;

	private static int 性別;

	private static double 身長;

	public staticPerson(String 名前) {
		this.名前 = 名前;
	}

	public void 自己紹介する() {
		System.out.println("私の名前は" + 名前 + "です");
	}
}
