package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage {
	
	public SeleniumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement javaForSelenium;
	
	public void javaForSeleniumLink()
	{
		javaForSelenium.click();
	}

}
