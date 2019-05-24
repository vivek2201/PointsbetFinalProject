import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Pointsbet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://user-usa.test.pointsbet.com/ft/b47554551c82474ea1ab3b3f273f5107");
		driver.findElement(By.xpath("//button[@class='ab-message-button'][2]")).click();

		WebDriverWait d = new WebDriverWait(driver, 80);// d knows about this 20 seconds for particular element
		d.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.ab-page-blocker.ab-hide")));
		//d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@ng-click='$ctrl.openLoginModal()']")));
		driver.findElement(By.xpath("//button[@ng-click='$ctrl.openLoginModal()']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("priya82201912");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("priya82201912");
		driver.findElement(By.id("login-button")).click();
		/*WebDriverWait d1 = new WebDriverWait(driver, 80);// d knows about this 20 seconds for particular element
		d1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.f14g0mss.fp5adqf")));*/
		Thread.sleep(5000L);
		driver.findElement(By.cssSelector("a.f14g0mss.fp5adqf")).click();
		driver.findElement(By.xpath("//deposit-limit-usa //div[@class='deposit-limit-actions'] //a[1]")).click();
		driver.findElement(By.xpath(" //label[@for='PeriodWeek']")).click();
		driver.findElement(By.xpath(" //div[@class='form-input form-input-deposit-limit'] //input")).sendKeys("500.00");
		driver.findElement(By.cssSelector("button.btn.btn-block-mobile.btn-secondary.btn-submit")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary.btn-block-mobile.btn-submit")).click();
		/*WebDriverWait d2 = new WebDriverWait(driver, 70);// d knows about this 20 seconds for particular element
		d2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-user-nav.ng-scope.pending")));*/
		Thread.sleep(5000L);
		driver.findElement(By.cssSelector("button.btn.btn-user-nav.ng-scope.pending")).click();
		Thread.sleep(5000L);
		/*WebDriverWait d3 = new WebDriverWait(driver, 40);// d knows about this 20 seconds for particular element
		d3.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/account/transaction-history']")));*/
		driver.findElement(By.xpath("//a[@href='/account/transaction-history']")).click();

	}

}
