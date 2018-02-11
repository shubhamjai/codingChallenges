package LogModeWriter.sinktype;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import test.flipkart.logger.entity.LogConfiguation;
import test.flipkart.logger.modewriter.SinkTypeWriter;

public class FileSinkTypeWriter implements SinkTypeWriter{

	public void writeLog(LogConfiguation logConfiguation, String message) throws IOException {
		File file = new File(logConfiguation.getFileLocation());
		BufferedWriter bw = null;
		FileWriter fw = null;
		if(!file.exists())
		{
			file.createNewFile();
		}
		
		fw = new FileWriter(logConfiguation.getFileLocation(), true);
		bw = new BufferedWriter(fw);
		bw.newLine();
		bw.append(logConfiguation.getLogMessage() + message);
		bw.close();
	}
}
