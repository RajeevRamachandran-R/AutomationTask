package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CommonUtils extends Driverinitializer{

	public static int waitTime = Integer.parseInt(getConfigProperty("waitTime"));
	
	public static void clickOn(WebElement element) {
		try {
			element.click();
			Log.info("Above element Clicked");
		}catch(Exception e)	{
			try {
			Log.info("Clicking element by js");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
			}catch (Exception ex) {
				Log.error(ex.toString());
			}
		}
	}

	public static void sendValue(WebElement element, String inputValue) {
		try	{
			Log.info("Sending Value to the Element");
			element.sendKeys(inputValue);
		}catch(Exception e)	{
			Log.error(e.toString());
		}
	}

	public static boolean isElementDisplayed(WebElement element) {
		try	{
			Log.info("Verifying element is displayed");
			return element.isDisplayed();
		} catch(Exception e) {
			Log.error(e.toString());
			return false;
		}
	}

	public static boolean isElementEnabled(WebElement element) {
		try	{
			Log.info("Verifying element is enabled");
			return element.isEnabled();
		} catch(Exception e) {
			Log.error(e.toString());
			return false;
		}
	}

	public static void waitForElement(int iSeconds, WebElement we) {
		try {
			Log.info("Waiting for element visible");
			WebDriverWait wait = new WebDriverWait(driver, iSeconds);
			wait.until(ExpectedConditions.visibilityOf(we));
		} catch (Exception e) {
			Log.error("TIMEOUT:The element did not appear in "+iSeconds+" seconds");
		}
	}

	public static boolean verifyPageTitle(String expectedVal) {
		boolean flag = false;
		try {
			Log.info("Verifying Page Title");
			String actualPageTitle=driver.getTitle();
			if(actualPageTitle.equalsIgnoreCase(expectedVal)) {
				Assert.assertEquals(actualPageTitle, expectedVal);
				flag = true;
			}
		} catch (Exception e) {
			Log.error(e.toString());
		}
		return flag;
	}

	public static void scrollToElement(WebElement element)	{
		try	{
			Log.info("Scroll To Element");
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);",element);
		} catch(Exception e) {
			Log.error(e.toString());
		}
	}

	public static String getConfigProperty(String keyword) {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData/testProperties.properties"));
		} catch (Exception e) {
			Log.error("Exception thrown while getting value of " + keyword + " from Test Configuration file" +e);
		}
		Log.info("Getting value of " + keyword + " from Test Configuration file : " + properties.getProperty(keyword));
		return properties.getProperty(keyword).trim();
	}
	
	public static boolean verifyElementDisapear(WebElement we) {
		boolean flag = false;
		try {
			Log.info("Waiting for element Invisible");
			boolean displayed = we.isDisplayed();
			if (!displayed) {
				flag = true;
			}
		} catch (Exception e) {
			Log.error("Error in verifyElementDisapear" +e);
		}
		return flag;
	}
	
}
