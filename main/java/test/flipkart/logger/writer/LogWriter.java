package test.flipkart.logger.writer;

import LogModeWriter.mode.ModeLogWriter;
import LogModeWriter.mode.ModeLogWriterFactory;
import LogModeWriter.sinktype.SinkTypeLogWriterFactory;

import java.io.IOException;

import test.flipkart.logger.entity.LogConfiguation;
import test.flipkart.logger.entity.LogLevel;
import test.flipkart.logger.globaldata.ConfigMap;
import test.flipkart.logger.modewriter.SinkTypeWriter;

public class LogWriter {

	public void writeLog(String message, LogLevel logLevel, String nameSpace)
	{
		LogConfiguation logConfiguation = ConfigMap.getConfigMap().get(logLevel.toString().toLowerCase());
		logConfiguation.setNameSpace(nameSpace);
		
		ModeLogWriter modelogWriter = ModeLogWriterFactory.getLogWriter(logConfiguation.getWriteMode());
		SinkTypeWriter sinkTypeWriter = SinkTypeLogWriterFactory.getLogWriter(logConfiguation.getSinkType());
		modelogWriter.setSinkTypeWriter(sinkTypeWriter);
		try {
			modelogWriter.writeLog(logConfiguation, message);
		} catch (IOException e) {
			System.out.println("Error While writing logs");
		}
	}
}
