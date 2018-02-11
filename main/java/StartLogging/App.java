package StartLogging;

import java.io.IOException;

import test.flipkart.logger.Logger;
import test.flipkart.logger.entity.LogLevel;
import test.flipkart.logger.init.InitLogger;

public class App {
	public static void main(String[] args) throws IOException {
		InitLogger.initLogProperties();
		//AsyncMessageHandler.handleAsyncMessage();
		Logger logger = Logger.getLogger("APP");
		logger.log("Info Logger Testing", LogLevel.INFO);
		logger.log("Fatal Logger Testing", LogLevel.FATAL);
		logger.log("Error Logger Testing", LogLevel.ERROR);
		//AsyncMessageHandler.stopQueueProcessing();;

	}
}
