package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaForSeleniumCoursePage {
	
	public JavaForSeleniumCoursePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement playBtn;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseBtn;
	
	public void playButton()
	{
		playBtn.click();
	}
	
	public void pauseButton()
	{
		pauseBtn.click();
	}

}
