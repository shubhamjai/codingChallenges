package LogModeWriter.mode;

import java.io.IOException;

import test.flipkart.logger.entity.LogConfiguation;
import test.flipkart.logger.globaldata.TaskQueue;

public class AsyncModeWriter extends ModeLogWriter{

	@Override
	public void writeLog(LogConfiguation logConfiguation, String message) throws IOException {
		TaskQueue.getQueue().add(new AsyncModeData(logConfiguation, message));
//		getSinkTypeWriter().writeLog(logConfiguation, message);
	}
}
