package LogModeWriter.mode;

import java.io.IOException;

import test.flipkart.logger.entity.LogConfiguation;
import test.flipkart.logger.modewriter.SinkTypeWriter;

public abstract class ModeLogWriter {
	
	private SinkTypeWriter sinkTypeWriter;

	public SinkTypeWriter getSinkTypeWriter() {
		return sinkTypeWriter;
	}

	public void setSinkTypeWriter(SinkTypeWriter sinkTypeWriter) {
		this.sinkTypeWriter = sinkTypeWriter;
	}

	public abstract void writeLog(LogConfiguation logConfiguation, String message) throws IOException;

}
