package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test1Page {

	WebDriver driver;
	String addItem = "Automation";
	
	public Test1Page(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement TOGGLE_ALL_CHECKBOX_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@name=\"data\"]") WebElement ADD_CHECKBOX_ITEM_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@value=\"Add\"]") WebElement ADD_BUTTON;
	
	@FindBy(how = How.CSS, using = "input[name=\"allbox\"]") WebElement TOGGLE_ALL_CHECKBOX_ELEMENT;
	@FindBy(how = How.CSS, using = "input[name=\"data\"]") WebElement ADD_CHECKBOX_ITEM_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value=\"Add\"]") WebElement ADD_BUTTON;
	
	
	
	
	public int randomGenerator(int boundaryNumber) {
		Random rnd = new Random();
		int randomNo = rnd.nextInt(boundaryNumber);
		return randomNo;
	}
	
	public void addingCheckboxItem() {
		
		ADD_CHECKBOX_ITEM_ELEMENT.sendKeys(addItem + randomGenerator(999));
		
	}
	
	
	public void clickingAddButton() {
		ADD_BUTTON.click();
		
	}
	
	public void toggleAllCheckbox() {
		TOGGLE_ALL_CHECKBOX_ELEMENT.click();
		

	}
		
}





