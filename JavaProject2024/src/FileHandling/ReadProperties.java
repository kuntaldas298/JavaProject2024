package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		//we are fetching file
		FileInputStream file = new FileInputStream("./app.properties");
		Properties properties = new Properties();
		properties.load(file);
		String filedata = properties.getProperty("name");
		System.out.println(filedata);
	}
}
