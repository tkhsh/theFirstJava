package sample.sample16;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class Sample16_2_6 {
	public static void main(String[] args) throws IOException {
		InputStream inputStream = new FileInputStream(new File("sampleIn.txt"));
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		OutputStream outputStream = new FileOutputStream(new File(
				"sampleOut.txt"));
		PrintStream printStream = new PrintStream(outputStream);

		String line = bufferedReader.readLine();
		for (int lineNo = 1; line != null; lineNo++) {
			printStream.println(lineNo + " : " + line);
			line = bufferedReader.readLine();
		}
		/*
		 * Java SE 7版 private static final String LINE_SEPARATOR =
		 * System.getProperty("line.separator");
		 * 
		 * public static void main(String[] args) throw IOException {
		 * BufferedReader bufferedReader =
		 * Files.newBufferedReader(Paths.get("sampleIn.txt"),
		 * Charset.forName("UTF-8")); Buffer
		 */
	}
}
