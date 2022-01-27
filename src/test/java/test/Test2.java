package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.Test2Page;
import util.BrowserFactory;

public class Test2 {
	
	
WebDriver driver;
	
	@Test
	public void clickingSingleItemToRemoveFromList() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		Test2Page t2 = PageFactory.initElements(driver, Test2Page.class);
		
		t2.clickingSingleCheckboxFromList();
		t2.clickingRemoveButton();
		System.out.println("One item is being removed from the list!!");
		
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
		
	}

}
