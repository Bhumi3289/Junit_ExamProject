package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Test3Page {
	
WebDriver driver;
	
	public Test3Page(WebDriver driver) {
		this.driver = driver;
	}

//	@FindBy(how = How.XPATH, using = "//input[@name='allbox']") WebElement TOGGLE_ALL_CHECKBOX_ELEMENT;
//	@FindBy(how = How.XPATH, using = "//input[@value=\"Remove\"]") WebElement REMOVE_BUTTON_ELEMENT;
	
	@FindBy(how = How.CSS, using = "input[name=\"allbox\"]") WebElement TOGGLEALLCHECKBOX_ELEMENT;
	@FindBy(how = How.CSS, using = "input[value=\"Remove\"]") WebElement REMOVE_BUTTON_ELEMENT;
	
	public void toggleAllCheckbox() {
		TOGGLEALLCHECKBOX_ELEMENT.click();
		
	}
	
	public void clickingRemoveButton() {
		REMOVE_BUTTON_ELEMENT.click();
		
	}
	
	
	

}
