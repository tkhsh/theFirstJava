package sample.sample19;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Calc {
	/*
	 * 修正前 public static String add(String value1, String value2) { return
	 * toString(toNumber(value1) - (toNumber(value2))); }
	 * 
	 * private static int toNumber(String value) { return
	 * Integer.parseInt(value); }
	 * 
	 * private static String toString(int value) { return
	 * Integer.toString(value); }
	 */
	public static String add(String value1, String value2) {
		return toString(toNumber(value1).add(toNumber(value2)));
	}

	private static BigDecimal toNumber(String value) {
		return new BigDecimal(value);
	}

	private static String toString(BigDecimal value) {
		return new DecimalFormat("0.00").format(value);
	}
}
