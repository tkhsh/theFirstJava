package sample.sample17;

import org.apache.log4j.Logger;

public class Sample17_1 {
	private static final Logger logger = Logger.getLogger(Sample17_1.class);

	public static void main(String[] args) {
		logger.debug("開始");

		int[] array = { 1, 2 };

		logger.debug(array[0]);
		logger.debug(array[1]);
		logger.debug(array[2]);

		logger.debug("終了");
	}
}
