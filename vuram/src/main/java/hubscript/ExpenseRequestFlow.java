package hubscript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpenseRequestFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sandhyan\\Desktop\\LocalWorkspace\\TestProject\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");

		// 1.Basic Xpath
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("vuramitem@vuram.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();

		driver.manage().window().maximize();

		// 2. Xpath Using Following *[@type='text']//following::input
		String a = driver
				.findElement(By.xpath("//*[@class='SizedText---medium SizedText---predefined']//following::span[65]"))
				.getText();
		System.out.println("Value of a =" + a);
		driver.findElement(By.xpath("//*[@class='SizedText---medium SizedText---predefined']//following::span[65]"))
				.click();
		// 3. Xpath Using parent
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Submit Expense Reimbursement']//parent::strong[1]")).click();
		// 4. Xpath using self
		WebElement expname = driver
				.findElement(By.xpath("//input[@placeholder='Give a name for your request']//self::input"));
		WebElement expenseitem = wait.until(ExpectedConditions.visibilityOf(expname));
		expenseitem.sendKeys("TestExpense");
		// 5. Xpath Using ancestor
		// Actions act = new Actions(driver);
		WebElement category = driver
				.findElement(By.xpath("//div[text()='Select an Expense Category']//ancestor::div[2]"));
		// String cat =
		// driver.findElement(By.xpath("//span[@id='8b23ffe5d2a01dad66dcf3a7756b773e_selectedChoice']//parent::div[1]")).getText();

		category.click();
		category.findElement(By.xpath("//div[text()='Appian World']")).click();
		// act.keyDown(category, "Appian World");
		WebElement currency = driver.findElement(By.xpath("//div[text()='Select a Currency']//self::div"));
		currency.click();
		currency.findElement(By.xpath("//div[text()='INR']")).click();
		driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']//self::input")).sendKeys("02/01/2023");
		WebElement exptype = driver.findElement(By.xpath("//div[text()='Choose Type of Expense']//self::div"));
		exptype.click();
		exptype.findElement(By.xpath("//div[text()='Flights']")).click();
		WebElement paymode = driver.findElement(By.xpath("//div[text()='Choose Payment Mode']//self::div"));
		paymode.click();
		paymode.findElement(By.xpath("//div[text()='Cash in Advance']")).click();
		WebElement expcurrency = driver.findElement(By.xpath("//div[text()='Choose Expense Currency']//self::div"));
		expcurrency.click();
		// Explicit Wait
		WebElement cur = wait
				.until(ExpectedConditions.visibilityOf(expcurrency.findElement(By.xpath("//div[text()='AUD']"))));
		cur.click();
		// Thread.sleep(5000);
		// expcurrency.findElement(By.xpath("//div[text()='AUD']")).click();
		// Thread.sleep(5000);
		WebElement convelement = driver.findElement(By.xpath(
				"//input[@type='text' and @class='TextInput---text TextInput---align_start TextInput---inSideBySideItem']//self::input"));
		WebElement cov = wait.until(ExpectedConditions.visibilityOf(convelement));
		cov.sendKeys("0.5");
		// driver.findElement(By.xpath("//input[@type='text' and
		// @class='TextInput---text TextInput---align_start
		// TextInput---inSideBySideItem']//self::input")).sendkeys("0.5");

		// Thread.sleep(5000);
		/*
		 * driver.findElement(By.xpath(
		 * "//input[@type='text' and @class='TextInput---text TextInput---align_start TextInput---inSideBySideItem']//following::input[1]"
		 * )) .sendKeys("100");
		 */
		Thread.sleep(10000);
		WebElement expamt = driver.findElement(By.xpath("/html/body/div[1]/div[1]/main/div/div/div[1]/div/div/div[2]/div[2]/div/div/div[6]/div[2]/div/div/div[2]/div[2]/div/div[6]/div/div[2]/div/input"));
			//	"//input[@class='TextInput---text TextInput---align_start TextInput---inSideBySideItem']//following::input"
		WebElement expamount = wait.until(ExpectedConditions.elementToBeClickable(expamt));
		// wait.until(ExpectedConditions.visibilityOf(expamt));
		expamount.sendKeys("100");

		// Thread.sleep(5000);
//		driver.findElement(By.xpath("//textarea[@placeholder='Give some details about this Expense']"))
//				.sendKeys("Business Travel");
		WebElement expnotes = driver
				.findElement(By.xpath("//textarea[@placeholder='Give some details about this Expense']"));
		WebElement notes = wait.until(ExpectedConditions.visibilityOf(expnotes));
		notes.sendKeys("Business Travel");
		// Implementing Robot Class
		WebElement addnewattachment = driver.findElement(By.xpath("//a[text()='Add new Attachment']//self::a"));
		wait.until(ExpectedConditions.elementToBeClickable(addnewattachment));
		addnewattachment.click();
		WebElement expitem = driver
				.findElement(By.xpath("//span[@data-placeholder='Select one or more items']//self::span"));
		wait.until(ExpectedConditions.visibilityOf(expitem));
		//expitem.click();
		
		driver.findElement(By.xpath("//*[@class='MultipleDropdownWidget---value_display']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='MenuWidget---listbox MenuWidget---relative MenuWidget---default_direction MenuWidget---inMultipleDropdownWidget MultipleDropdownWidget---dropdown_list MultipleDropdownWidget---multi MultipleDropdownWidget---open MultipleDropdownWidget---no_top_border MultipleDropdownWidget---is_selectable']")).click();    
        //driver.findElement(By.xpath("//*[@class='MenuWidgetItem---active MenuWidgetItem---default_direction']")).click();
        Thread.sleep(5000);
		//WebElement expattsel = driver.findElement(By.xpath("//span[text()='Other']//self::span"));
		//WebElement expselatt= wait.until(ExpectedConditions.elementToBeClickable(expattsel));
		//expitem.sendKeys("Other");

        
		

	}

}
