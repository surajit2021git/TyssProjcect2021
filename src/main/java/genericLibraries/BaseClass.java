package genericLibraries;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public PropertyFile propertyData=new PropertyFile();
	public WebDriverUtilities utilities=new WebDriverUtilities();
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void openApp(String BrowserName) throws FileNotFoundException, IOException
	{
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
		
			driver=new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		/*WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();*/
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(propertyData.getData("url"));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(ITestResult result) throws IOException
	{
		int statusOfTestcase = result.getStatus();
		String failedTestcaseName = result.getName();
		if(statusOfTestcase==2)
		{
			Photo photo=new Photo();
			photo.getPhoto(driver, failedTestcaseName);
		}
		
		driver.quit();
	}

}
