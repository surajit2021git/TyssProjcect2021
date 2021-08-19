package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	public FacebookLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='English (UK)']")
	private WebElement englishLanguageBtn;

	public WebElement getEnglishLanguageBtn() {
		return englishLanguageBtn;
	}
	
	public void englishButton()
	{
		englishLanguageBtn.click();
	}
	
}
