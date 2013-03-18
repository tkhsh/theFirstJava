package sample.sample18;

import java.util.List;

import org.apache.log4j.Logger;

@SuppressWarnings("unused")
public class Sample18_2 {

	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(Sample18_2.class);

	@SuppressWarnings("unused")
	private static long 掛け算(long val1, long val2) {
		return val1 * val2;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void add(List list, String str) {
		list.add(str);
	}

}
