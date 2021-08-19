package genericLibraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	
	public void dropDown(WebElement dropDownAdress,String text)
	{
		Select select=new Select(dropDownAdress);
		
		select.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.doubleClick(element).perform();
	}
	
	public void rightClick(WebDriver driver,WebElement element)
	{
		Actions action=new Actions(driver);
		action.contextClick(element).perform();
	}
	
	public void dragAndDrop(WebDriver driver,WebElement sourceElement,WebElement targetElement)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).perform();
	}
	
	public void frameSwitch(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void frameSwitchBack(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void switchTabs(WebDriver driver)
	{
		Set<String> windowId = driver.getWindowHandles();
		for(String window : windowId)
		{
			driver.switchTo().window(window);
		}
	}
	
	public void scrollBar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(x,y)");
	}
	
	public void alertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}

}
