package pageObjectModels;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class HomePageObject {
	public WebDriver driver;

	By iphone = By.xpath("//input[@placeholder='Search']");
	By isearch = By.xpath("(//button[@type='button'])[4]");
	By addtocartiphone = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	By selectiphoneprice = By.xpath("//p[@class='price']");
	By addtocartsamsung = By.xpath("(//i[@class ='fa fa-shopping-cart'])[5]");
	By selectsamsungprice = By.xpath("(//p[@class='price'])[2]");
	By openaddtocart = By.xpath("(//i[@class='fa fa-shopping-cart'])[2]");
	By cartvalue = By.xpath("(//td[@class='text-right'])[12]");

	public HomePageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement enterIphone() {
		return driver.findElement(iphone);
	}

	public WebElement clickSearch() {
		return driver.findElement(isearch);
	}

	public WebElement clickOnAddToCart() {
		return driver.findElement(addtocartiphone);
	}

	public WebElement selectIphonePrice() {
		return driver.findElement(selectiphoneprice);
	}

	public WebElement clickOnAddToCartSamsung() {
		return driver.findElement(addtocartsamsung);
	}

	public WebElement selectSamsungPrice() {
		return driver.findElement(selectsamsungprice);
	}

	public WebElement clickOpenAddToCart() {
		return driver.findElement(openaddtocart);
	}

	public WebElement SelectCartValue() {
		return driver.findElement(cartvalue);
	}

}
