package sample.sample17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

public class Sample17_12 {

	private static final Logger logger = Logger.getLogger(Sample17_12.class);

	public static void main(String[] args) {
		try {
			process();
		} catch (FileNotFoundException e) {
			logger.error("sampleIn.txtというファイルが存在するか確認してください。");
		} catch (IOException e) {
			logger.error("入出力例外が発生しました。もう一度実行してください。");
		} catch (FileLineException e) {
			logger.error(e.getMessage());
		}
	}

	private static void process() throws IOException, FileLineException {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("sampleIn.txt"));
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream);
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);

			String line = bufferedReader.readLine();
			for (int lineNo = 1; line != null; lineNo++) {
				if (10 <= lineNo) {
					throw new FileLineException(
							"sampleIn.txtは10行以上あるため処理を中断しました。");
				}
				logger.debug(lineNo + " : " + line);
				line = bufferedReader.readLine();
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
		}
	}
}
