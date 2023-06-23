package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	public static void intializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");

		prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup(); // To run with latest browser
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			// fire fox code

		} else if (browserName.equalsIgnoreCase("edge")) {

			// edge code

		} else {

			System.out.println("please enter proper browser value");

		}
	}

	@BeforeMethod
	public void launchUrl() throws IOException {
		intializeDriver();
		String url = prop.getProperty("url");
		driver.get(url);
	}

}
