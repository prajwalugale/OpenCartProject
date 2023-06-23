package testCases;

import java.io.IOException;
import java.util.Arrays;

import org.testng.annotations.Test;

import pageObjectModels.HomePageObject;
import resources.BaseClass;
import resources.CommonUtilities;
import resources.Constant;

public class VerifyAddToCart extends BaseClass {
	@Test
	public static void addToCart() throws IOException, InterruptedException {

		HomePageObject obj = new HomePageObject(driver);
		obj.enterIphone().sendKeys(Constant.iphone);
		obj.clickSearch().click();
		// Thread.sleep(2000);
		obj.clickOnAddToCart().click();

		// System.out.println(obj.selectIphonePrice().getText());
		String iprice = obj.selectIphonePrice().getText();
		String[] ipriceslipt = iprice.split("\\s+");
		String i = ipriceslipt[0];
		// System.out.println(Arrays.toString(ipriceslipt));
		// System.out.println(i);
		String ip = i.replace("$", "");
		// System.out.println(ip);
		double d1 = Double.parseDouble(ip);
		System.out.println(d1);

		// Samsung code

		obj.enterIphone().clear();
		obj.enterIphone().sendKeys(Constant.samsung);
		Thread.sleep(2000);
		obj.clickSearch().click();
		obj.clickOnAddToCartSamsung().click();
		// System.out.println(obj.selectSamsungPrice().getText());
		String sprice = obj.selectSamsungPrice().getText();
		String[] samsungslipt = sprice.split("\\s+");
		String s = samsungslipt[0];
		// System.out.println(Arrays.toString(samsungslipt));
		// System.out.println(s);
		String sp = s.replace("$", "");
		// System.out.println(sp);
		double d2 = Double.parseDouble(sp);
		System.out.println(d2);

		// SumOfProductValues

		double d = d1 + d2;

		String SumWith$ = "$" + d;
		System.out.println(SumWith$);
		Thread.sleep(2000);
		obj.clickOpenAddToCart().click();
		String cartvalue = obj.SelectCartValue().getText();
		CommonUtilities.HanddleAssertion(cartvalue, SumWith$);
	}

}
