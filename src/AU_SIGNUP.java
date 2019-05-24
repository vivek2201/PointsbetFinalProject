import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AU_SIGNUP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya.singhal\\eclipse-workspace\\Introduction\\LIB\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize your window size
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//Default URL
		
		driver.get("https://user.test.pointsbet.com.au/ft/b47554551c82474ea1ab3b3f273f5107");
		//driver.get("https://system.test.pointsbet.com.au/ft/ab0348f5aeb244d4b5299814fc645a23");
		Thread.sleep(8000L);
		AUSIGNUP_DETAILS signup=new AUSIGNUP_DETAILS();
		
		signup.CreateAccount(driver);
		System.out.println("Signup is done");
		//DepositPageAU depositpage=new DepositPageAU();
		//depositpage.Deposit(driver);
		//AU_InplayBet inplaybet=new AU_InplayBet();
		//inplaybet.PlaceInplayBet(driver);
		}

}
