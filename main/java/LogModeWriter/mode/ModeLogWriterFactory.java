package LogModeWriter.mode;

import test.flipkart.logger.modewriter.SyncModeWriter;

public class ModeLogWriterFactory
{
	public static ModeLogWriter getLogWriter(String mode)
	{
		if("SYNC".equalsIgnoreCase(mode))
		{
			return new SyncModeWriter();
		}
		else if("ASYNC".equalsIgnoreCase(mode))
		{
			return new AsyncModeWriter();
		}
		return null;
	}
}