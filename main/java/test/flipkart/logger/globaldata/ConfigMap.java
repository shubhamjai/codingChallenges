package test.flipkart.logger.globaldata;

import java.util.HashMap;
import java.util.Map;

import test.flipkart.logger.entity.LogConfiguation;

public class ConfigMap {

	private static Map<String, LogConfiguation> configMap = new HashMap<String, LogConfiguation>();

	public static Map<String, LogConfiguation> getConfigMap() {
		return configMap;
	}
}
