package sample.sample17;

import java.util.Date;

import org.apache.log4j.Logger;

public class Sample17_5 {
	private static final Logger logger = Logger.getLogger(Sample17_5.class);

	private boolean startメソッド処理中 = false;

	public static void main(String[] args) {
		Sample17_5 sample17_5 = new Sample17_5();
		try {
			sample17_5.start();
		} finally {
			logger.debug("startメソッド処理中：" + sample17_5.startメソッド処理中);
		}
	}

	private void start() {
		/*
		 * 修正前 startメソッド処理中 = true;
		 * 
		 * int[] array = { 0 }; while (startメソッド処理中) { logger.debug(new Date());
		 * if (array[1] == 0) { startメソッド処理中 = false; } }
		 */
		try {
			startメソッド処理中 = true;

			int[] array = { 0 };
			while (startメソッド処理中) {
				logger.debug(new Date());
				if (array[1] == 0) {
					startメソッド処理中 = false;
				}
			}
		} finally {
			startメソッド処理中 = false;
		}
	}
}
