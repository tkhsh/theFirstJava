package sample.sample17;

import org.apache.log4j.Logger;

public class Sample17_3 {
	private static final Logger logger = Logger.getLogger(Sample17_3.class);

	public static void main(String[] args) {
		logger.debug("開始");

		int[] array = { 1, 2 };

		try {
			logger.debug("tryブロック開始");
			logger.debug(array[0]);
			logger.debug(array[1]);
			logger.debug(array[2]);
			logger.debug("tryブロック終了");
		} finally {
			logger.debug("finallyブロックです");
		}

		logger.debug("終了");
	}
}
