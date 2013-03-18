package sample.sample16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

public class Sample16_8 {
	private static final Logger logger = Logger.getLogger(Sample16_8.class);

	public static void main(String[] args) throws IOException {
		StringBuilder builder = new StringBuilder();
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		logger.debug("追加する文字列を入力してください");
		String input = bufferedReader.readLine();
		builder.append(input);

		logger.debug("さらに追加する文字列を入力してください");
		input = bufferedReader.readLine();
		builder.append(input);

		logger.debug("長さを何文字にするか入力してください");
		int length = Integer.parseInt(bufferedReader.readLine());
		if (0 < length && length <= builder.length()) {
			builder.setLength(length);
		}
		logger.debug("結果は" + builder.reverse().toString() + "です。");
	}
}
