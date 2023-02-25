package com.generic_library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile 
{
	public String getpropertydata(String key) throws IOException
	{
		Properties property = new Properties();
		FileInputStream file = new FileInputStream(Autoconstants.Propertypath);
		property.load(file);
		
		return property.getProperty(key);
		
	}
}
