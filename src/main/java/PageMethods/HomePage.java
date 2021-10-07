package PageMethods;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import locators.HomePageLoc;
import utilities.CommonUtils;
import utilities.Log;

public class HomePage extends CommonUtils{

	public void verifyPageLoaded() {
		try {
			driver.get(getConfigProperty("url"));
			driver.manage().timeouts().pageLoadTimeout(waitTime, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			if(verifyPageTitle(getConfigProperty("homePageTitle"))) {
				Log.info("Navigated to the "+getConfigProperty("url")+" pages");
			}else {
				Log.error("Failed to Navigated to the "+getConfigProperty("url")+" pages");
			}
		}catch (Exception e) {
			Log.error("Error in verifyPageLoaded" +e);
		}
	}

	public void fillingDetails(DataTable dataTable) {
		try {
			List<Map<String, String>> listmap = dataTable.asMaps(String.class, String.class);
			Map<String, String> map = listmap.get(0);
			Set<String> keySet = map.keySet();

			List<WebElement> labelElements = driver.findElements(HomePageLoc.txt_FieldLabels);
			for (WebElement webElement : labelElements) {
				String text = webElement.getText();
				if(keySet.contains(text)) {
					String value = map.get(text);
					if (text.equalsIgnoreCase("Application type") | text.equalsIgnoreCase("Property you would like to buy") ) {
						By button = By.xpath("//label[@class='borrow__question__heading']/..//li//label[normalize-space(text())='"+value+"']");
						clickOn(driver.findElement(button));
					}else if (text.equalsIgnoreCase("Number of dependants")) {
						By dropdown = By.xpath("//label[@class='borrow__question__heading']/..//select");
						Select select = new Select(driver.findElement(dropdown));
						select.selectByVisibleText(value);
					}else {
						By input = By.xpath("//label[@class='borrow__question__heading'and text()='"+text+"']/..//input");
						sendValue(driver.findElement(input), value);
					}
				}
			}

		}catch (Exception e) {
			Log.error("Error in fillingDetails" +e);
		}
	}

	public void clickAndButtonAndVerifyEstimatedLoanAmount(String amount) {
		try {
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			clickOn(driver.findElement(HomePageLoc.btn_BorrowCalculater));
			waitForElement(waitTime, driver.findElement(HomePageLoc.txt_EstimatedBorrowAmount));
			String actualAmt = (String) ((JavascriptExecutor) driver).executeScript("return arguments[0].value;",driver.findElement(HomePageLoc.txt_EstimatedBorrowAmount));
			Log.info("Expected Amount: " +amount);
			Log.info("Actual Amount: $" +actualAmt);
			Assert.assertEquals(Integer.parseInt(amount.replaceAll("[\\$,]","")), Integer.parseInt(actualAmt.replaceAll("[\\$,]","")));
			Log.info("Calculated Amount and Expected Amount Matched" +amount);
		}catch (Exception e) {
			Log.error("Error in clickAndButtonAndVerifyEstimatedLoanAmount" +e);
		}
	}

	public void verifyStartOverButtonClearTheForm() {
		try {
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			clickOn(driver.findElement(HomePageLoc.btn_BorrowCalculater));
			waitForElement(waitTime, driver.findElement(HomePageLoc.txt_EstimatedBorrowAmount));
			isElementDisplayed(driver.findElement(HomePageLoc.btn_StartOver));
			clickOn(driver.findElement(HomePageLoc.btn_StartOver));
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			boolean startover = verifyElementDisapear(driver.findElement(HomePageLoc.btn_StartOver));
			boolean estimatedAmount = verifyElementDisapear(driver.findElement(HomePageLoc.txt_EstimatedBorrowAmount));
			if (estimatedAmount & startover) {
				Log.info("Successfully Form Cleared by using StartOver button");
			}else {
				Log.error("failed to Cleared form by using StartOver button");
			}
		}catch (Exception e) {
			Log.error("Error in verifyPageLoaded" +e);
		}
	}

	public void verifyReturnMessage() {
		try {
			driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
			clickOn(driver.findElement(HomePageLoc.btn_BorrowCalculater));
			waitForElement(waitTime, driver.findElement(HomePageLoc.msg_ReturnMsg));
			isElementDisplayed(driver.findElement(HomePageLoc.msg_ReturnMsg));
			String text = driver.findElement(HomePageLoc.msg_ReturnMsg).getText();
			Log.info("Expected Msg: " +getConfigProperty("message"));
			Log.info("Actual Msg: " +text);
			Assert.assertEquals(getConfigProperty("message"), text);
			Log.info("Successfully verified the expected message" +text);
		}catch (Exception e) {
			Log.error("Error in verifyPageLoaded" +e);
		}
	}
}
