package Vtigre;

import java.io.FileInputStream;
import java.util.Properties;



public class PropertyFileFetching {
	public static void main(String[] args) throws Throwable {
        //Create object of FIS class
	    FileInputStream fis=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\AdvanceSelenium\\DRIVERS\\credentials.properties");
	    //Create object of Properties class
		Properties p=new Properties();
		p.load(fis);
		//Print username
		String UN=p.getProperty("un");
		System.out.println(UN);
		//Print password
		String PWD=p.getProperty("pwd");
		System.out.println(PWD);
		String URL=p.getProperty("url");
		System.out.println(URL);
		String BROWSER=p.getProperty("browser");
		System.out.println(BROWSER);
		
		
	}

}
