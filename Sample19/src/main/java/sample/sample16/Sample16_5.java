package sample.sample16;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

public class Sample16_5 {
	private static final Logger logger = Logger.getLogger(Sample16_5.class);

	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("豊臣秀吉");

		debug(nameSet);

		nameSet.add("織田信長");

		debug(nameSet);

		nameSet.add("豊臣秀吉");
		nameSet.add("徳川家康");

		debug(nameSet);
	}

	private static void debug(Set<String> nameSet) {
		logger.debug("");

		for (String name : nameSet) {
			logger.debug(name);
		}

		debugContains(nameSet, "織田信長");
		debugContains(nameSet, "豊臣秀吉");
		debugContains(nameSet, "徳川家康");
	}

	private static void debugContains(Set<String> nameSet, String name) {
		if (nameSet.contains(name)) {
			logger.debug(name + "はSetに含まれています");
		} else {
			logger.debug(name + "はSetに含まれていません");
		}
	}
}
