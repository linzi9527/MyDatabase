package database.isaac;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class IOProperties {
	
	public IOProperties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void getProperties(String key) {
		Properties properties = new Properties();
		String projectPath = System.getProperty("user.dir");
//		System.out.println(projectPath);
		String propertiesPath = projectPath + File.separator+
				"resources"+File.separator+"Eng.properties";
		try {
			InputStream in = new FileInputStream(propertiesPath);
			properties.load(in);
			System.out.println(properties.get(key));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
