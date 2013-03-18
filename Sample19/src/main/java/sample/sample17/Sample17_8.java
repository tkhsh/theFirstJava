package sample.sample17;

import java.io.IOException;

import org.apache.log4j.Logger;

public class Sample17_8 {

	private static final Logger logger = Logger.getLogger(Sample17_8.class);

	public static void main(String[] args) {
		logger.debug("開始");

		int[] array = { 1, 2 };

		try {
			logger.debug(array[0]);
			logger.debug(array[1]);
			logger.debug(array[2]);
		} catch (Throwable t) {
			logger.debug(t.getClass().getName() + "という種類の例外を受け取りました。");
			if (t instanceof ArrayIndexOutOfBoundsException) {
				logger.debug("tはArrayIndexOutOfBoundsExceptionのオブジェクトです。");
			}
			if (t instanceof IOException) {
				logger.debug("tはIOExceptionのオブジェクトです。");
			}
			logger.error("スタックトレースを出力", t);
		}

		logger.debug("終了");
	}
}
