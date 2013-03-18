package quiz16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class Quiz16_3 {
	private static final Logger logger = Logger.getLogger(Quiz16_3.class);

	public static void main(String[] args) {
		String format = "yyyy/MM/dd";

		DateFormat dateFormat = new SimpleDateFormat(format);
		logger.debug(dateFormat.format(new Date()));
	}
}
