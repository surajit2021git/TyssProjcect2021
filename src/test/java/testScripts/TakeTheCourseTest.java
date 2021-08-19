package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.JavaForSeleniumCoursePage;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPage;

public class TakeTheCourseTest extends BaseClass{
	
	
	@Test
	public void Testcase3() throws FileNotFoundException, IOException, InterruptedException
	{
		SkillraryLoginPage loginPage=new SkillraryLoginPage(driver);
		loginPage.searchFor(propertyData.getData("searchData"));
		loginPage.goSearch();
		
		SeleniumPage pageSelenium=new SeleniumPage(driver);
		pageSelenium.javaForSeleniumLink();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
		
		utilities.frameSwitch(driver,0);
		JavaForSeleniumCoursePage coursePage=new JavaForSeleniumCoursePage(driver);
		Thread.sleep(10000);
		coursePage.playButton();
		Thread.sleep(10000);
		
		coursePage.pauseButton();
		
		utilities.frameSwitchBack(driver);
		//Assert.assertEquals(driver.getTitle(), propertyData.getData("TakeCousrseTitle"));
		
		
	}

}
