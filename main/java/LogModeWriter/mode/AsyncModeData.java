package LogModeWriter.mode;

import test.flipkart.logger.entity.LogConfiguation;

public class AsyncModeData {

	private LogConfiguation logConfiguation;
	private String message;
	
	public AsyncModeData(LogConfiguation logConfiguation, String message) {
		super();
		this.logConfiguation = logConfiguation;
		this.message = message;
	}
	public LogConfiguation getLogConfiguation() {
		return logConfiguation;
	}
	public void setLogConfiguation(LogConfiguation logConfiguation) {
		this.logConfiguation = logConfiguation;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
