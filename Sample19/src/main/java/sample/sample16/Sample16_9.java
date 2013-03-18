package sample.sample16;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class Sample16_9 {
	private static final Logger logger = Logger.getLogger(Sample16_9.class);

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		logger.debug("Date#toString() : " + date.toString() + "\n");

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		logger.debug("DateFormatを使うと（その１） : " + dateFormat.format(date));
		dateFormat = new SimpleDateFormat("yy年MM月dd日(E) HH:mm:ss");
		logger.debug("DateFormatを使うと（その２）：" + dateFormat.format(date) + "\n");

		Calendar calendar = Calendar.getInstance();
		date = calendar.getTime();
		logger.debug("Calendarから作成したDate：" + dateFormat.format(date));

		calendar.clear();
		date = calendar.getTime();
		logger.debug("Calendar#clear()直後：" + dateFormat.format(date));

		calendar.set(Calendar.YEAR, 2010);
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DAY_OF_MONTH, 31);
		calendar.set(Calendar.HOUR_OF_DAY, 13);
		calendar.set(Calendar.MINUTE, 35);
		date = calendar.getTime();
		logger.debug("Calendarで日時指定したDate：" + dateFormat.format(date));

		calendar.add(Calendar.DAY_OF_MONTH, 1);
		date = calendar.getTime();
		logger.debug("１日追加：" + dateFormat.format(date) + "\n");

		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		logger.debug(year + "(年です。)");
		logger.debug(month + "月です。〜番目の月という意味。");
		logger.debug(day + "(日です。)" + "\n");

		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		date = dateFormat.parse("2022/01/25 23:55:11");

		logger.debug("文字列からDateを作成：" + dateFormat.format(date) + "\n");

		logger.debug("String#format(String, Object...）を使うと（その１）："
				+ String.format("%tY/%tm/%td", date, date, date));
		logger.debug("String#format(String, Object...)を使うと（その２）："
				+ String.format("%tY/%<tm/%<td", date));
	}
}
