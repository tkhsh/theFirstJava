package sample.sample17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

import org.apache.log4j.Logger;

public class Sample17_7 {
	private static final Logger logger = Logger.getLogger(Sample17_7.class);

	public static void main(String[] args) throws IOException {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(new File("sampleOut.txt"));
			PrintStream printStream = new PrintStream(outputStream);

			inputStream = new FileInputStream(new File("sample.txt"));
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream);
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);

			String line = bufferedReader.readLine();
			for (int lineNo = 1; line != null; lineNo++) {
				printStream.println(lineNo + " : " + line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			logger.error("入出力例外が発生しました");
			logger.error("例外メッセージ : " + e.getMessage());
		} finally {
			close(inputStream, outputStream);
		}
	}

	private static void close(InputStream inputStream, OutputStream outputStream)
			throws IOException {
		try {
			if (inputStream != null) {
				logger.debug("inputStreamをcloseします");
				inputStream.close();
			}
		} finally {
			if (outputStream != null) {
				logger.debug("outputStreamをcloseします");
				outputStream.close();
			}
		}
	}
}