package sample.sample17;

import org.apache.log4j.Logger;

public class Sample17_4 {
	private static final Logger logger = Logger.getLogger(Sample17_4.class);

	public static void main(String[] args) {
		// 駄目なコード(finallyブロックでreturn)
		logger.debug("開始");

		String string = getString();
		logger.debug(string);

		throwException();

		logger.debug("終了");
	}

	private static String getString() {
		// tryブロックのreturnが無視される
		try {
			return "Java";
		} finally {
			return "finally";
		}
	}

	private static void throwException() {
		try {
			logger.debug("tryブロック開始");
			int[] array = { 0 };
			logger.debug(array[100]); // 例外を発生させる。
			logger.debug("tryブロック終了");
		} finally {
			// return;
		}
	}
}
