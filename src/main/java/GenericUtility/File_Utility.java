package GenericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility {
	public String getStringKeyAndValue(String key) throws Throwable
	{
		
	    FileInputStream fis=new FileInputStream("./src/test/resources/AdvSelenium.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}

}
