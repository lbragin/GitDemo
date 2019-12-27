import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		String path = "c://Users/lbragin/workspace/JavaTutorial/src/test.properties";

		Properties prop = new Properties(); 
		FileInputStream fs = new FileInputStream(path);
		
		prop.load(fs);
		System.out.println(prop.getProperty("name"));

	}

}
