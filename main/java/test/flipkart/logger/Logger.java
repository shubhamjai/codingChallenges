package test.flipkart.logger;

import test.flipkart.logger.entity.LogLevel;
import test.flipkart.logger.writer.LogWriter;

public class Logger {

	String namespace;
	
	private Logger() {}
	
	private Logger(String namespace)
	{
		this.namespace = namespace;
	}
	
	public static Logger getLogger(String namespace)
	{
		return new Logger(namespace);
	}

	public void log(String message, LogLevel logLevel)
	{
		new LogWriter().writeLog(message, logLevel, namespace);
	}
	
}
