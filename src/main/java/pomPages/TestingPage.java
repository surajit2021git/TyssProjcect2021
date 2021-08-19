package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	
	@FindBy(xpath="//i[@class='fa fa-facebook']")
	private WebElement facebookBtn;
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void facebookButton()
	{
		facebookBtn.click();
	}

}
