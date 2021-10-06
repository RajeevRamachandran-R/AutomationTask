package locators;

import org.openqa.selenium.By;

public class HomePageLoc {

	public static By txt_FieldLabels = By.xpath("//label[@class='borrow__question__heading']");
	public static By btn_BorrowCalculater = By.xpath("//button[@id='btnBorrowCalculater']");
	public static By txt_EstimatedBorrowAmount = By.xpath("//span[@class='borrow__result__text' and text()='We estimate you could borrow:']/span");
	public static By btn_StartOver = By.xpath("//div[@class='borrow__result text--white clearfix']//button[@class='start-over']");
	public static By msg_ReturnMsg = By.xpath("//span[@class='borrow__error__text']");
}
