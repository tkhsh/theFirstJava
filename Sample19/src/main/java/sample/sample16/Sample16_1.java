package sample.sample16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Sample16_1 {
	public static void main(String[] args) throws IOException {
		PrintStream printStream = System.out;
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String input = bufferedReader.readLine();
		long val1 = Long.parseLong(input);
		input = bufferedReader.readLine();
		long val2 = Long.parseLong(input);

		printStream.println(val1 + " + " + val2 + " = " + (val1 + val2));
	}
}
