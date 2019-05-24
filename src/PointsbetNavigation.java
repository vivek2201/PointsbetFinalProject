import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PointsbetNavigation {

	public static void main(String[] args) throws InterruptedException
	{

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//Default URL
		driver.get("https://user-usa.test.pointsbet.com/ft/b47554551c82474ea1ab3b3f273f5107");
		Thread.sleep(8000L);
		driver.findElement(By.xpath("//button[@class='ab-message-button'][2]")).click();
        WebDriverWait d = new WebDriverWait(driver, 5);
		d.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.ab-page-blocker.ab-hide")));
		Pointsbetlogin pb=new Pointsbetlogin();
		pb.login(driver);
		Thread.sleep(5000L);
		SportsNavigation sportsNavigation=new SportsNavigation();
		sportsNavigation.sportsNavigationValidation(driver);
		
		}
		
}


