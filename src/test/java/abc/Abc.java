package abc;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Abc {
	FileInputStream f;
	Properties p;

	
	public void run()
	{
		System.setProperty("webdriver.gecko.driver","E://geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.google.com");
		String h=d.getTitle();
		assertEquals("Google", h);
	}
		
	public String getProperty(String key)
	{
		try {
			 f=new FileInputStream("TestData/rt.properties");
		     p =new Properties();
			 p.load(f);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(key);
	}
    
	@Parameters({"browser","name"})
	@Test
public void r(String browser,String name)
{
	System.out.println(getProperty("name"));
	System.out.println("Browser:"+browser);
	System.out.println();
}
}
