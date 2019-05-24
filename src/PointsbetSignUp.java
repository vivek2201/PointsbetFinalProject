import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PointsbetSignUp {

	public static void main(String[] args) throws InterruptedException, IOException{
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize your window size
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Default URL
		//driver.get("https://system-usa.test.pointsbet.com/ft/ab0348f5aeb244d4b5299814fc645a23");
		driver.get("https://user-usa.test.pointsbet.com/ft/b47554551c82474ea1ab3b3f273f5107");
		Thread.sleep(8000L);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\priya.singhal\\screenshot.png"));
		
		driver.findElement(By.xpath("//button[@class='ab-message-button'][2]")).click();
        WebDriverWait d = new WebDriverWait(driver, 5);
		d.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.ab-page-blocker.ab-hide")));
		driver.findElement(By.xpath("//a[@href='/signup']")).click();
		SignUP signup=new SignUP();
		signup.CreateAccount(driver);
		
		

	}

}
