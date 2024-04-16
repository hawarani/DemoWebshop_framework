package genericlibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptUtility {
	
	
	public static void scrollTillWebElement(WebDriver driver, WebElement element) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", element);
	
	Thread.sleep(4000);
	}
	public static void click(WebDriver driver, WebElement element) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		Thread.sleep(4000);
	}
	
	public static void scrollDown(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(4000);
	}
	
	public static void scrollUp(WebDriver driver) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500);");
		Thread.sleep(4000);
	}

	public static void passValue(WebDriver driver, WebElement element, String value) throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+value+"'", element);
		Thread.sleep(4000);
	}
}
