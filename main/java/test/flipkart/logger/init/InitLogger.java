package test.flipkart.logger.init;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import test.flipkart.logger.entity.LogConfiguation;
import test.flipkart.logger.globaldata.ConfigMap;

public class InitLogger {
	
	public static void initLogProperties() throws IOException
	{
		String base = ".\\src\\resources\\logConfig";

		int i = 0;
		while(true)
		{
			String fileName = base + i +".property";
			File f = new File(fileName);
			if(f.exists())
			{
				FileInputStream is = new FileInputStream(fileName);
				Properties p = new Properties();
				InputStreamReader ir = new InputStreamReader(is);
				p.load(ir);
				LogConfiguation logConfiguation = new LogConfiguation();
				logConfiguation.setFileLocation(p.getProperty("file_location"));
				logConfiguation.setLogLevel(p.getProperty("log_level").toLowerCase());
				logConfiguation.setSinkType(p.getProperty("sink_type"));
				logConfiguation.setTimeFormat(p.getProperty("ts_format"));
				logConfiguation.setWriteMode(p.getProperty("write_mode"));
				ConfigMap.getConfigMap().put(logConfiguation.getLogLevel(), logConfiguation);
				i++;
			}
			else
			{
				break;
			}
		}
	}
}
