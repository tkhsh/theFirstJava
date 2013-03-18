package quiz16;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

public class Quiz16_2 {
	private static final Logger logger = Logger.getLogger(Quiz16_2.class);

	private static final Set<String> friendNames = new HashSet<String>();

	static {
		friendNames.add("青山今日子");
		friendNames.add("相沢紗代");
	}

	public static void main(String[] args) {
		String name = "相沢紗代";
		if (isFriend(name)) {
			logger.debug(name + "さんは、友達です");
		} else {
			logger.debug(name + "さんは、友達ではありません");
		}
	}

	private static boolean isFriend(String string) {
		return friendNames.contains(string);
	}
}
