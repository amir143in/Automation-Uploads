package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.BaseClass;

 
public class HomePage{
	
	//private BaseClass baseClass;
	private WebDriver ldriver;
	
	public HomePage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(css =  "li[class='nav-item active'] a[class='nav-link']")
	private WebElement menuHome;
	
	@FindBy(css = "#cartur")
	private WebElement menuCart;
	
	@FindBy(css = ".btn.btn-success")
	private WebElement btnPlaceOrder;

	
	public void selectProduct(String product) throws InterruptedException {
			
		WebElement productName = ldriver.findElement(By.linkText(product));
		if (productName.isDisplayed()) {
			
			BaseClass.javaScriptClick(productName, ldriver);
			
		} else {
			System.out.println("No se encuentra el producto...");
		}
		
		WebElement addToCartBtn = ldriver.findElement(By.cssSelector(".btn.btn-success.btn-lg"));
		if (addToCartBtn.isEnabled()) {
			
			BaseClass.javaScriptClick(addToCartBtn, ldriver);
		} else {
			System.out.println("El botón de agregar al carrito no está habilitado...");
		}
		
		TimeUnit.SECONDS.sleep(5);
		Alert alert = ldriver.switchTo().alert();
		alert.accept();
		
		clickMenuHome();
		
	}
	
	public void clickMenuHome() throws InterruptedException {
		BaseClass.javaScriptClick(menuHome, ldriver);
		
	}
	
	public void clickMenuCart() throws InterruptedException {
		BaseClass.javaScriptClick(menuCart, ldriver);
		
		int countTotalProductAdded = ldriver.findElements(By.xpath("//*[@id='tbodyid']/tr")).size();
		try {
			if (countTotalProductAdded ==2) {
				BaseClass.javaScriptClick(btnPlaceOrder, ldriver);
				//btnPlaceOrder.click();
			}
		} catch (Exception e) {
			
			Assert.assertFalse(true, "El botón de Order Button no está disponible");
		}
	}
	
}
