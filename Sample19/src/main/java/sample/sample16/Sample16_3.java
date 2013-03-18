package sample.sample16;
import org.apache.log4j.Logger;

public class Sample16_3 {
	private static final Logger logger = Logger.getLogger(Sample16_3.class);

	public static void main(String[] args) {
		logger.debug("mainメソッド開始");

		for (int i = 0; i < 10; i++) {
			logger.debug("for文" + i + "回目の処理");
		}

		Loggerのメソッドを試す();

		logger.debug("mainメソッド修了");

	}

	private static void Loggerのメソッドを試す() {
		logger.debug("デバッグ情報の出力はこのメソッドを使用");
		logger.info("運行情報の出力はこのメソッドを使用");
		logger.warn("警告情報の出力はこのメソッドを使用");
		logger.error("エラー情報の出力はこのメソッドを使用");
		logger.fatal("致命的な情報の出力はこのメソッドを使用");
	}
}
