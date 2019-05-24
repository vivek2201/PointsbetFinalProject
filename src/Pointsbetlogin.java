import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pointsbetlogin {
	public void login(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@ng-click='$ctrl.openLoginModal()']")).click();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("REWQT");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password1");
		driver.findElement(By.id("login-button")).click();
	}

}
