package sample.sample16;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class Sample16_6 {
	private static final Logger logger = Logger.getLogger(Sample16_6.class);

	public static void main(String[] args) {
		Map<String, Integer> nameYearMapping = new HashMap<String, Integer>();

		nameYearMapping.put("織田信長", 1534);

		debug("織田信長", nameYearMapping);

		nameYearMapping.put("豊臣秀吉", 100);

		debug("豊臣秀吉", nameYearMapping);

		nameYearMapping.put("豊臣秀吉", 1537);
		nameYearMapping.put("徳川家康", 1543);
		nameYearMapping.put("足利義昭", 1537);

		debug("徳川家康", nameYearMapping);
		debug("足利義昭", nameYearMapping);
		debug("豊臣秀吉", nameYearMapping);

		debug("聖徳太子", nameYearMapping);
	}

	private static void debug(String name, Map<String, Integer> nameYearMapping) {
		logger.debug("");

		Integer birthYear = nameYearMapping.get(name);
		if (birthYear == null) {
			logger.debug(name + "のデータは登録されていません");
			return;
		}
		logger.debug(name + "は" + birthYear + "年生まれです");
	}
}
