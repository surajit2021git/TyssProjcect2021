package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class AddingProductCart extends BaseClass{
	
	
	@Test
	public void testCase1() throws FileNotFoundException, IOException
	{
	
		SkillraryLoginPage loginPage=new SkillraryLoginPage(driver);
		loginPage.gearsButton();
		
		loginPage.skillraryDemoApplication();
		
		utilities.switchTabs(driver);
		SkillraryDemoLoginPage demoLogin=new SkillraryDemoLoginPage(driver);
		
		utilities.mouseHover(driver, demoLogin.getCourseBtn());
		demoLogin.seleniumTrainingButton();
		
		AddToCartPage cartPage=new AddToCartPage(driver);
		utilities.doubleClick(driver, cartPage.getAddBtn());
		cartPage.addToCartButton();
		
		utilities.alertPopup(driver);
		
		Assert.assertEquals(driver.getTitle(), propertyData.getData("addToCartPageTitile"));
		
		
	}
	
	

}
