package quiz17;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

public class Quiz17_1 {
	private static final Logger logger = Logger.getLogger(Quiz17_1.class);

	public static void main(String[] args) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm");
		logger.debug(dateFormat.parseObject("2000/01/01"));
	}
}
