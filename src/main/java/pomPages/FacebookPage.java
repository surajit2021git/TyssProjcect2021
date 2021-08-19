package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	
	public FacebookPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement likeBtn;

	public WebElement getLikeBtn() {
		return likeBtn;
	}
	
	public void likeButton()
	{
		likeBtn.click();
	}

}
