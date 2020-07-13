package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static void main(String[] args) throws IOException{
		FileInputStream fl = new FileInputStream("../Selenium/ChromeDriver/qwerty.properties");
		
		Properties prop = new Properties();
		
		prop.load(fl);
		
		System.out.println(prop.getProperty("password"));
	}
}
