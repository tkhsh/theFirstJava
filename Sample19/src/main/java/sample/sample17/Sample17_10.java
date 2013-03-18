package sample.sample17;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Sample17_10 {

	private static final Logger logger = Logger.getLogger(Sample17_10.class);

	public static void main(String[] args) {
		Object object = null;
		try {
			logger.debug("object.toString()します");
			object.toString();
			logger.debug("object.toString()しました");

			logger.debug("method()します");
			method();
			logger.debug("method()しました");

			List<Object> list = new ArrayList<Object>();
			while (true) {
				logger.debug("list.add(new Object())します");
				list.add(new Object());
				logger.debug("list.add(new Object())しました");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			logger.error("ArrayIndexOutOfBoundsExceptionが発生しました");
		} catch (RuntimeException e) {
			logger.error("RuntimeExceptionが発生しました(" + e.getClass().getName()
					+ ")");
		} catch (StackOverflowError e) {
			logger.error("StackOverflowErrorが発生しました");
		} catch (OutOfMemoryError e) {
			logger.error("OutOfMemoryErrorが発生しました");
		} catch (Error e) {
			logger.error("Errorが発生しました(" + e.getClass().getName() + ")");
		}
	}

	private static void method() {
		method();
	}
}
