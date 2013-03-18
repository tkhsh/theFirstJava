package sample.sample12;

import java.util.Date;

public class Person {
	private String 名前;

	private Date 生年月日;

	private int 性別;

	private double 身長;

	public Person() {
	}

	public Person(String 名前) {
		this.名前 = 名前;
	}

	public Person(String 名前, double 身長) {
		this.名前 = 名前;
		this.身長 = 身長;
	}

	public void 自己紹介する() {
		System.out.println("私の名前は" + 名前 + "です。身長は" + 身長 + "cmです。");
	}

	public double get身長() {
		return 身長;
	}

	public void set身長(double 身長) {
		this.身長 = 身長;
	}

	public int get性別() {
		return 性別;
	}

	public void set性別(int 性別) {
		this.性別 = 性別;
	}

	public Date get生年月日() {
		return 生年月日;
	}

	public void set生年月日(Date 生年月日) {
		this.生年月日 = 生年月日;
	}

	public String get名前() {
		return 名前;
	}

	public void set名前(String 名前) {
		this.名前 = 名前;
	}
}
