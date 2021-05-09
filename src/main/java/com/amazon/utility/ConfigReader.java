package com.amazon.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public String readConfig(String value) {
		try {
			Properties pr = new Properties();
			String path = System.getProperty("user.dir") + File.separator + "config.properties";
			FileInputStream f = new FileInputStream(path);
			pr.load(f);
			return pr.getProperty(value);
		}catch(Exception e) {
			return null;
		}
	}
}
