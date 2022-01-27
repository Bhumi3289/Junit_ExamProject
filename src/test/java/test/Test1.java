package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import page.Test1Page;
import util.BrowserFactory;

public class Test1  {


WebDriver driver;
	
	@Test
	public void userClickingOntoggleCheckbox() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		Test1Page t1 = PageFactory.initElements(driver, Test1Page.class);
		t1.addingCheckboxItem();
		t1.clickingAddButton();
		
		t1.addingCheckboxItem();
		t1.clickingAddButton();
		
		t1.addingCheckboxItem();
		t1.clickingAddButton();
		
		t1.toggleAllCheckbox();
		
		
		System.out.println("All checkBoxes are checked");
		
		Thread.sleep(2000);
		BrowserFactory.tearDown();
	}
		
}

	  	

