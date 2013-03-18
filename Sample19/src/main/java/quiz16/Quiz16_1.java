package quiz16;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Quiz16_1 {
	private static final Logger logger = Logger.getLogger(Quiz16_1.class);

	public static void main(String[] args) {
		/*
		 * 変更前 String[] names = {"相沢紗代", "青山今日子", "赤谷尚子" };
		 * 
		 * for (String name : names) { logger.debug(name); }
		 */
		List<String> namesList = new ArrayList<String>();

		namesList.add("相沢紗代");
		namesList.add("青山今日子");
		namesList.add("赤谷尚子");

		for (String name : namesList) {
			logger.debug(name);
		}
	}
}
