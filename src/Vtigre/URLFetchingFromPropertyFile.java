package Vtigre;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class URLFetchingFromPropertyFile {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver","C:\\Users\\dell\\Downloads\\edgedriver_win64(1)\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.get("https://localhost:8888"); Instead writing URL, Fetch From Credentials.properties File
		FileInputStream fis=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\AdvanceSelenium\\DRIVERS\\credentials.properties");
		Properties p= new Properties();
		p.load(fis);
		String URL=p.getProperty("url");
		System.out.println(URL);
		//Open URL after fetching from property file 
		driver.get(URL);
	}

}
