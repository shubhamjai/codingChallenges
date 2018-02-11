package test.flipkart.logger.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogConfiguation {

	private String timeFormat;
	private String logLevel;
	private String sinkType;
	private String fileLocation;
	private String writeMode;
	private String nameSpace;
	
	public String getTimeFormat() {
		return timeFormat;
	}
	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}
	public String getLogLevel() {
		return logLevel;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}
	public String getSinkType() {
		return sinkType;
	}
	public void setSinkType(String sinkType) {
		this.sinkType = sinkType;
	}
	public String getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	public String getWriteMode() {
		return writeMode;
	}
	public void setWriteMode(String writeMode) {
		this.writeMode = writeMode;
	}
	public String getNameSpace() {
		return nameSpace;
	}
	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}
	
	public String getLogMessage()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(new SimpleDateFormat(getTimeFormat()).format(new Date()));
		sb.append(" , ");
		sb.append(getLogLevel());
		sb.append(" , ");
		sb.append(getNameSpace());
		sb.append(" , ");
		sb.toString();
		return sb.toString();
	}
}
