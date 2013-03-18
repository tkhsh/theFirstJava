package sample.sample19;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testAdd() {
		String actual = Calc.add("3", "1");
		assertEquals("3+1=4", "4.00", actual);
	}

	@Test
	public void 小数の足し算() {
		assertEquals("4.20", Calc.add("3.10", "1.10"));
	}

	@Test
	public void 小数点３桁以下を含む足し算() {
		assertEquals("0.00", Calc.add("0", "0.004"));
		assertEquals("0.00", Calc.add("0", "0.005"));
		assertEquals("0.01", Calc.add("0", "0.005000000001"));
	}

	@Test
	public void 負の数の足し算() {
		assertEquals("-1.00", Calc.add("1", "-2"));
		assertEquals("2.23", Calc.add("-4", "6.23"));
		assertEquals("-10.23", Calc.add("-4", "-6.23"));
	}

	@Test(expected = NullPointerException.class)
	public void 第一引数がNullのとき() throws Exception {
		Calc.add(null, "-2");
	}

	@Test
	public void 第二引数がNullのとき() throws Exception {
		try {
			Calc.add("1", null);
			fail();
		} catch (NullPointerException success) {
			assertNull(success.getMessage());
		}
	}

	@Test
	public void 桁の大きな数字の足し算() {
		StringBuilder bigNum = new StringBuilder();
		StringBuilder expected = new StringBuilder();
		for (int i = 0; i < 2000; i++) {
			bigNum.append("1");
			expected.append("2");
		}
		expected.append(".00");

		String actual = Calc.add(bigNum.toString(), bigNum.toString());
		assertEquals(expected.toString(), actual);
	}
}
