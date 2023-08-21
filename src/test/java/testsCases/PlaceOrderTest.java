package testsCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.CustomerDetailsPage;
import pages.HomePage;
import utils.*;

public class PlaceOrderTest extends BaseClass {
	

	private HomePage homePage;
	private CustomerDetailsPage customerDetailsPage;
	
	@Test
	public void TC_AddTwoItemsAndPlaceOrder() throws InterruptedException {
		//BaseClass baseClass = new BaseClass(driver);
		homePage = new HomePage(driver);
		homePage.selectProduct("Samsung galaxy s6");
		TimeUnit.SECONDS.sleep(5);
		homePage.selectProduct("Nokia lumia 1520");
		TimeUnit.SECONDS.sleep(5);
		homePage.clickMenuCart();
		
		customerDetailsPage = new CustomerDetailsPage(driver);
		customerDetailsPage.enterName("Amir Ali");
		customerDetailsPage.enterCountry("Ecuador");
		customerDetailsPage.enterCity("Quito");
		customerDetailsPage.enterCard("1234567890123456");
		customerDetailsPage.enterMonth("10");
		customerDetailsPage.enterYear("2025");
		customerDetailsPage.clicBtnPurchase();
		
		
		
	}
	
	
}
