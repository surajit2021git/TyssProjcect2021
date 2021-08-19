package testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.FacebookLoginPage;
import pomPages.FacebookPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestingPageFacebooklink extends BaseClass{
	
	
	@Test
	public void TestCase1() throws FileNotFoundException, IOException
	{
		SkillraryLoginPage loginPage=new SkillraryLoginPage(driver);
		loginPage.gearsButton();
		loginPage.skillraryDemoApplication();
		
		utilities.switchTabs(driver);
		SkillraryDemoLoginPage demoLoginPage=new SkillraryDemoLoginPage(driver);
		
		utilities.mouseHover(driver, demoLoginPage.getSelectCategory());
		demoLoginPage.selectCategoryDropDown();
		utilities.dropDown(demoLoginPage.getSelectCategory(), propertyData.getData("dropdownOption"));
		
		TestingPage testPage=new TestingPage(driver);
		testPage.facebookButton();
		
		FacebookPage fbPage=new FacebookPage(driver);
		utilities.mouseHover(driver, fbPage.getLikeBtn());
		fbPage.likeButton();
		
		FacebookLoginPage fbLoginPage=new FacebookLoginPage(driver);
		utilities.mouseHover(driver, fbLoginPage.getEnglishLanguageBtn());
		fbLoginPage.englishButton();
		
		Assert.assertEquals(driver.getTitle(), propertyData.getData("facebookLoginPageTitle"));
	}
}
	


