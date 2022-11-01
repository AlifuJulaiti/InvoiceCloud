package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.HomePage;
import utilities.BaseClass;

public class HomePageTests {

	HomePage hp = new HomePage();
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {

		//open browser and get URL
		driver = BaseClass.openBrowserAndGetURL();
	
	}

	@AfterClass
	public void destroy() {
		BaseClass.tearDown();
	}
	
	
	@Test
	public void helloTest() {
		System.out.println("Hello Test");
	}
	
	@Test
	public void addElement() {
		hp.addElement.click();
		
	}

	
	
}
