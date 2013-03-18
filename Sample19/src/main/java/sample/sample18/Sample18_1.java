package sample.sample18;

import org.apache.log4j.Logger;

public class Sample18_1 {

	private static final Logger logger = Logger.getLogger(Sample18_1.class);

	public static void main(String[] args) {
		logger.debug(効率のよい掛け算(5, 10));
		logger.debug(掛け算(5, 10));
	}

	public static long 効率のよい掛け算(long val1, long val2) {
		return val1 * val2;
	}

	/**
	 * @see #効率のよい掛け算(long, long)
	 */
	@Deprecated
	public static long 掛け算(long val1, long val2) {
		long result = 0;
		for (int i = 0; i < val2; i++) {
			result += val1;
		}
		return result;
	}
}
