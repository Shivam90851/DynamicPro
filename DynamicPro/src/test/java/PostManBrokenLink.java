import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.Util;

public class PostManBrokenLink extends DriverInit {
	WebDriver driver;
	Util util;

	public PostManBrokenLink() {
		driver = init();
		util = new Util(driver);

	}

	@BeforeClass
	public void web() {
		util.navigate("https://demo.guru99.com/test/newtours/");
	}

	@Test
	public void Collecthref() {
		List<WebElement> herf = driver.findElements(By.tagName("a"));
		for (WebElement herf1 : herf) {

			String url = herf1.getAttribute("href");
			System.out.println(url);

			try

			{
				HttpURLConnection abc = (HttpURLConnection) (new URL(url).openConnection());
				abc.getContent();

				if (abc.getResponseCode() >= 400) {
					System.out.println(abc + "is broken");
				}
			}

			catch (Exception e) {
			}
		}
	}

	@AfterClass
	public void close() {
		driver.quit();
	}

}