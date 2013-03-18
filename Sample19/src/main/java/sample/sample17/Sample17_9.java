package sample.sample17;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Sample17_9 {

	private static final Logger logger = Logger.getLogger(Sample17_9.class);

	public static void main(String[] args) {
		Object object = null;
		try {
			object.toString();
		} catch (RuntimeException e) {
			logger.error("実行時例外", e);
		}

		try {
			method();
		} catch (Error e) {
			logger.error("エラー", e);
		}

		try {
			List<Object> list = new ArrayList<Object>();
			while (true) {
				list.add(new Object());
			}

		} catch (Error e) {
			logger.error("エラー", e);
		}
	}

	private static void method() {
		method();
	}

}
