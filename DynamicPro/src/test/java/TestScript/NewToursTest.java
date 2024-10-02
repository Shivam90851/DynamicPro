package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Framework.DriverInit;
import Framework.Util;
import Script.NewTours;

public class NewToursTest extends DriverInit{
	WebDriver driver;
	Util util;
	NewTours newTours;
	
	NewToursTest (){
		driver=init();
		util =new Util(driver);
		newTours = new NewTours(driver);
		
	}
	@BeforeClass
	public void navigation() {
		util.navigate("");
	}
	@Test
	public void run2() {
		
	}
	//hashmap
	//arraylist
	//set

}
