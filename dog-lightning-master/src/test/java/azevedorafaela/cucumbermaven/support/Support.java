package azevedorafaela.cucumbermaven.support;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Support {

	public String baseUrl;
	public String user;
	public String pass;

	// Get the properties file with the baseUrl, user and pass,
	// will be available for any class
	public void getProperties() throws IOException {
		Properties prop = new Properties();
		//InputStream inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
		//prop.load(inputStream);
		FileReader reader=new FileReader("config.properties"); 
		prop.load(reader);
		
		this.baseUrl = prop.getProperty("baseUrl");
		System.out.println(baseUrl);
		this.user = prop.getProperty("user");
		this.pass = prop.getProperty("password");
	}

}
