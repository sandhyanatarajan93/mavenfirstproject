package hubscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	
	public WebDriver initialize(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sandhyan\\Desktop\\LocalWorkspace\\TestProject\\driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			
		}else if (browsername.equalsIgnoreCase("ie")) {
			
		}
		return driver;
		
	}
	
	public void clickelement (String element) {
		 driver.findElement(By.xpath(element)).click();
	}
	
	public void SendValue(String element, String val) {
		 driver.findElement(By.xpath(element)).sendKeys(val);
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}

}
