package TestScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.Util;
import Script.Upload;
import dev.failsafe.internal.util.Durations;

public class UpoadTest extends DriverInit {
	WebDriver driver;
	Util util;
	Upload UpL;
	WebDriverWait wait;
	

	UpoadTest() {
		driver = init();
		PageFactory.initElements(driver, this);
		util = new Util(driver);
		UpL = new Upload(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}

	@BeforeClass(alwaysRun = true)
	public void navigation() {
		util.navigate("https://demo.guru99.com/test/upload/");
	}

	@Test
	public void run1() {
		UpL.FileTask();
		
		
		WebElement SuccessMessage = driver
				.findElement(By.xpath("//*[@id='res']//*[text()='has been successfully uploaded.']"));
		wait.until(ExpectedConditions.visibilityOf(SuccessMessage));
		String SuccessMessages = SuccessMessage.getText();
		String Sm = new String("has been successfully uploaded.");
		
		if (SuccessMessages == Sm) {
			System.out.println("Passed1O1");

		} else {
			System.out.println("Fail101");
		}
	}

	@AfterClass
	public void close() {
		driver.quit();
	}
}
