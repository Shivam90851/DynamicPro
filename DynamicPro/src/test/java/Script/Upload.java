package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.DriverInit;
import Framework.Util;

public class Upload extends DriverInit{
	WebDriver driver;
	Util util;
	
	@FindBy(xpath="//*[@id='uploadfile_0']")
	WebElement choosefile;
	
	@FindBy(xpath="//*[@id='terms']")
	WebElement Terms;

	@FindBy(xpath="//*[@id='submitbutton']")
	WebElement Upload;
	
	public Upload (WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
		util = new Util(driver);
				
				
	}
	public void FileTask() {
		UploadFile();
		Selecterm();
		UploadIt();
	}
	private void UploadFile() {
		choosefile.sendKeys("C:\\Users\\Asus\\Downloads");
		
	}
	private void Selecterm() {
		Terms.click();
		
	}
	private void UploadIt() {
		Upload.click();
		
	}
	

}
