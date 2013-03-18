package sample.sample16;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Sample16_4 {
	private static final Logger logger = Logger.getLogger(Sample16_4.class);

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		debug(list);

		list.add(2, 10);

		debug(list);
	}

	private static void debug(List<Integer> list) {
		logger.debug("");

		for (int i = 0; i < list.size(); i++) {
			logger.debug(i + "番目の要素の値は、" + list.get(i));
		}

		logger.debug("");

		for (int num : list) {
			logger.debug(num);
		}
		/*
		 * イテレータを使ったfor文 for (Interator<Integer> iter = list.iterator();
		 * iter.hasNext();) { Itnteger num = iter.next(); logger.debug(num); }
		 */
	}
}
