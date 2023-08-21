package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.BaseClass;

public class CustomerDetailsPage {

	private WebDriver ldriver;
	
	public CustomerDetailsPage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "name")
	private WebElement txtName;
	
	@FindBy(id = "country")
	private WebElement txtCountry;
	
	@FindBy(id = "city")
	private WebElement txtCity;
	
	@FindBy(id = "card")
	private WebElement txtCard;
	
	@FindBy(id = "month")
	private WebElement txtMonth;
	
	@FindBy(id = "year")
	private WebElement txtYear;
	
	@FindBy(css = "button[onclick='purchaseOrder()']")
	private WebElement btnPurchase;
	
	@FindBy(xpath = "//h2[normalize-space()='Thank you for your purchase!']")
	private WebElement msgConfirmacion;
	
	public void enterName(String name) {
		txtName.sendKeys(name);
	}
	
	public void enterCountry(String country) {
		txtCountry.sendKeys(country);
	}
	
	public void enterCity(String city) {
		txtCity.sendKeys(city);
	}
	
	public void enterCard(String card) {
		txtCard.sendKeys(card);
	}
	
	public void enterMonth(String month) {
		txtMonth.sendKeys(month);
	}
	
	public void enterYear(String year) {
		txtYear.sendKeys(year);
	}
	
	public void clicBtnPurchase() throws InterruptedException {
		
		if (btnPurchase.isEnabled()) {
			BaseClass.javaScriptClick(btnPurchase, ldriver);
			TimeUnit.SECONDS.sleep(2);
			boolean actualMsg =	msgConfirmacion.getText().contains("Thank you for your purchase");
			Assert.assertTrue(actualMsg);
			
		}
	}
	
}
