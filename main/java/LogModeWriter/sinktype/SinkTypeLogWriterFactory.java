package LogModeWriter.sinktype;

import test.flipkart.logger.modewriter.SinkTypeWriter;

public class SinkTypeLogWriterFactory {
	
	public static SinkTypeWriter getLogWriter(String sinkType)
	{
		if("File".equalsIgnoreCase(sinkType))
		{
			return new FileSinkTypeWriter();
		}
		else if("DB".equalsIgnoreCase(sinkType))
		{
			return new DBSinkTypeWriter();
		}
		
		return null;
	}

}
