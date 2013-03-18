package sample.sample16;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.apache.log4j.Logger;

public class Sample16_10 {

	private static final Logger logger = Logger.getLogger(Sample16_10.class);

	public static void main(String[] args) throws ParseException {
		Locale locale = new Locale("ja", "JP", "JP");
		DateFormat format = new SimpleDateFormat("GGGGyy年MM月dd日", locale);
		logger.debug(format.format(new Date()));

		Locale.setDefault(locale);
		format = new SimpleDateFormat("Gyy年MM月dd日");
		logger.debug(format.format(new Date()));

		Calendar cal = Calendar.getInstance(locale);
		int eraValue = cal.get(Calendar.ERA);
		logger.debug(元号に変換(eraValue));
	}

	private static String 元号に変換(int eraValue) {
		switch (eraValue) {
		case 0:
			return "明治以前";
		case 1:
			return "明治";
		case 2:
			return "大正";
		case 3:
			return "昭和";
		case 4:
			return "平成";
		default:
			throw new IllegalArgumentException();
		}
	}
}
