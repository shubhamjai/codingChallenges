package test.flipkart.logger.modewriter;

import java.io.IOException;

import test.flipkart.logger.entity.LogConfiguation;

public interface SinkTypeWriter {
	
	public void writeLog(LogConfiguation logConfiguation, String message) throws IOException;
}
