package sample.sample16;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

public class Sample16_7 {
	private static final Logger logger = Logger.getLogger(Sample16_7.class);

	public static void main(String[] args) {
		Map<Integer, List<String>> birthYearNamesMapping = new HashMap<Integer, List<String>>();

		add("織田信長", 1534, birthYearNamesMapping);

		debug(birthYearNamesMapping);

		add("豊臣秀吉", 1537, birthYearNamesMapping);

		debug(birthYearNamesMapping);

		add("徳川家康", 1543, birthYearNamesMapping);
		add("足利義昭", 1537, birthYearNamesMapping);

		debug(birthYearNamesMapping);
	}

	private static void debug(Map<Integer, List<String>> ageNamesMapping) {
		logger.debug("");
		Set<Integer> ages = ageNamesMapping.keySet();
		for (int age : ages) {
			logger.debug(age + "年生まれの人は" + ageNamesMapping.get(age) + "です");
		}
	}

	private static void add(String name, int age,
			Map<Integer, List<String>> birthYearNamesMapping) {
		List<String> names = birthYearNamesMapping.get(age);
		if (names == null) {
			names = new ArrayList<String>();
			birthYearNamesMapping.put(age, names);
		}
		names.add(name);
	}
}
