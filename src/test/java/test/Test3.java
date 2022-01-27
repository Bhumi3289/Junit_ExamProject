package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Test3Page;
import util.BrowserFactory;

public class Test3 {

	
WebDriver driver;
	
	@Test
	public void userClickingOntoggleCheckbox() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		Test3Page t3 = PageFactory.initElements(driver, Test3Page.class);
		t3.toggleAllCheckbox();
		t3.clickingRemoveButton();
		System.out.println("All list items is removed using the remove button and when Toggle All functionality is on.");
	
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
		
	}
	
	
}
