package helpers;

import org.openqa.selenium.WebElement;

public class Operation {
	
	public static void sendKeys(WebElement element, String value){
		element.sendKeys(value);
	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public static String getText(WebElement element) {
		return element.getText();
	}
}
