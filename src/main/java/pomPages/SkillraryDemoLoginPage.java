package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	
	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement courseBtn;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumTrainingBtn;
	
	@FindBy(xpath="//select[@class='chosen-select']")
	private WebElement selectCategory;
	
	
	
	public WebElement getSelectCategory() {
		return selectCategory;
	}


	public SkillraryDemoLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void seleniumTrainingButton()
	{
		seleniumTrainingBtn.click();
	}

	public WebElement getCourseBtn() {
		return courseBtn;
	}
	
	public void selectCategoryDropDown(){
		selectCategory.click();
		
	}

}
