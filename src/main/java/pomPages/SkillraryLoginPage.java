package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbBtn;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement skillraryDemoApp;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchBar;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement search;
	
	public  SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gearsButton()
	{
		gearsbBtn.click();
	}
	
	public void skillraryDemoApplication()
	{
		skillraryDemoApp.click();
	}
	
	public void searchFor(String searchOption)
	{
		searchBar.sendKeys(searchOption);
	}
	
	public void goSearch()
	{
		search.click();
	}

}
