package test.flipkart.logger.modewriter;

import java.io.IOException;

import LogModeWriter.mode.ModeLogWriter;
import test.flipkart.logger.entity.LogConfiguation;

public class SyncModeWriter extends ModeLogWriter {

	@Override
	public void writeLog(LogConfiguation logConfiguation, String message) throws IOException {
		getSinkTypeWriter().writeLog(logConfiguation, message);
	}

}
