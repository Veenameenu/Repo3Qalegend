package Automation_Core;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Base_Class {
	public WebDriver driver;	
	public WebDriver browserinstialization(String browserName) throws Exception
	{
		if(browserName.equalsIgnoreCase("chrome")) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
			driver =new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver =new FirefoxDriver();
		}
			
		else {
			throw new Exception("Invalid Name Exception");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		return driver;
	}
	public String getScreenShotpath(String TestcaceName, WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		String DestinationFile=System.getProperty("user.dir")+"\\test-output\\"+TestcaceName+".png";
		Files.copy(source,new File(DestinationFile));
		return DestinationFile;
	}
	}




