package test.flipkart.logger.async.handler;

import java.io.IOException;

import LogModeWriter.mode.AsyncModeData;
import LogModeWriter.sinktype.SinkTypeLogWriterFactory;
import test.flipkart.logger.globaldata.TaskQueue;
import test.flipkart.logger.modewriter.SinkTypeWriter;

public class AsyncMessageHandler {

	public static volatile boolean shouldKeepLooping = true;
	
	public static void handleAsyncMessage() {
		while (shouldKeepLooping) {
			if (null != TaskQueue.getQueue().peek()) {
				AsyncModeData data = TaskQueue.getQueue().remove();
				SinkTypeWriter sinkWriter = SinkTypeLogWriterFactory
						.getLogWriter(data.getLogConfiguation().getSinkType());
				try {
					sinkWriter.writeLog(data.getLogConfiguation(), data.getMessage());
				} catch (IOException e) {
					System.out.println("Error while writing log");
				}
			} else {
				System.out.println("Queue empty");

			}
		}
	}

	public static void stopQueueProcessing() {
		
		shouldKeepLooping = false;
	}
}
